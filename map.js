var map;
function initMap() {
  map = new google.maps.Map(document.getElementById('map'), {
    zoom: 2,
    center: new google.maps.LatLng(2.8,-187.3),
    mapTypeId: 'terrain'
  });

	var infowindow = new google.maps.InfoWindow();


  // Create a <script> tag and set the USGS URL as the source.
  var script = document.createElement('script');
  // This example uses a local copy of the GeoJSON stored at
  // http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojsonp
  script.src = 'geo2.js';
  document.getElementsByTagName('head')[0].appendChild(script);
}

// Loop through the results array and place a marker for each
// set of coordinates.
window.eqfeed_callback = function(results) {
  for (var i = 0; i < results.features.length; i++) {
    var coords = results.features[i].geometry.coordinates;
    var latLng = new google.maps.LatLng(coords[1],coords[0]);
    var marker = new google.maps.Marker({
      position: latLng,
      map: map
    });
		infowindow = new google.maps.InfoWindow();

		google.maps.event.addListener(marker, 'click', ((x)=>function() {
			infowindow.setContent('<div><strong> HII </strong><br>'  + results.features[x].properties.formatted_address+ '</div>');
			infowindow.open(map, this);
			console.log(results.features[x].properties.formatted_address);
		})(i));



  }
}
