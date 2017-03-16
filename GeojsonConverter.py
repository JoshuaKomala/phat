import csv
import sys

# Read in raw data from csv
input_file = sys.argv[1]
output_file = sys.argv[2]
rawData = csv.reader(open(input_file, 'rb'), dialect='excel')

# the template. where data from the csv will be formatted to geojson
template = \
    ''' \
    { 
            "type" : "Feature",
            "geometry" : {
                "type" : "Point",
                "coordinates" : ["%s","%s"]},
            "properties" : { 
%s
            }
        }'''

# the head of the geojson file
output = \
    ''' \
{ "type" : "Feature Collection",
    {"features" : [
    '''

row_count = sum(1 for row in rawData)
rawData = csv.reader(open('outTest.csv', 'rb'), dialect='excel')
header = rawData.next();
column_count = len(header)

iter = 0


#convert first row
#for i in range(0, column_count - 1):
#            header[i] = first_row[i]

#convert the rest of the rows
for row in rawData:
     
    print "%s" % iter
    #print row

    #if iter >= 1:
    properties = ""
    for i in range(0, column_count - 2):
        properties += '''\t\t\t\t\t\t\t"%s": "%s",\n''' % (header[i], row[i])
    properties += '''\t\t\t\t\t\t\t"%s": "%s"\n''' % (header[column_count - 1], row[column_count - 1])
    lat = row[5]
    lon = row[6]
    #name = row[2]
    #pop = row[4]
    output += "\n\t" + template % (lat, lon, properties)
    if iter < row_count - 2:
        output += ","

    iter += 1
# the tail of the geojson file
output += \
    ''' \
    ]
}
    '''
    
# opens an geoJSON file to write the output to
outFileHandle = open(output_file, "w")
outFileHandle.write(output)
outFileHandle.close()