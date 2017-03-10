var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
		zoom: 7,
		center: {lat: 28.3949 , lng: 84.1240},
		mapTypeId: 'terrain'
	});

	// Create a <script> tag and set the USGS URL as the source.
	var script = document.createElement('script');

	// This example uses a local copy of the GeoJSON stored at
	// http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojsonp
	script.src = '';
	document.getElementsByTagName('head')[0].appendChild(script);

	map.data.setStyle(function(feature) {
		var magnitude = feature.getProperty('mag');
		return {
			icon: getCircle(magnitude)
		};
	});
}

function getCircle(magnitude) {
	return {
		path: google.maps.SymbolPath.CIRCLE,
		fillColor: 'red',
		fillOpacity: .2,
		scale: Math.pow(2, magnitude) / 2,
		strokeColor: 'white',
		strokeWeight: .5
	};
}

function eqfeed_callback(results) {
	map.data.addGeoJson(results);
}
