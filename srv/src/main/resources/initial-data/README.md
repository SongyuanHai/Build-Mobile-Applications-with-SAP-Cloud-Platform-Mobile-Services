For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file BookingSet.json:

''' JSON
[
    {
        "BookingDate": "2019-09-03T18:48:15.499Z",
        "BookingID": "101",
        "MenuID": "301",
        "Price": "12345678.12",
        "Status": "ABCDEFGHIJKLMNOPQRST",
        "User": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "BookingDate": "2019-09-03T18:48:15.499Z",
        "BookingID": "102",
        "MenuID": "302",
        "Price": "98765432.98",
        "Status": "XYZ",
        "User": "XYZ"
    }
]
'''

Sample initial data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": "201",
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "1234567890123",
        "Name": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "CanteenID": "202",
        "Location": "XYZ",
        "MenuID": "9876543210987",
        "Name": "XYZ"
    }
]
'''

Sample initial data for file MenuSet.json:

''' JSON
[
    {
        "BookingID": "1234567890123",
        "CanteenID": "1234567890123",
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "301",
        "Price": "12345678.12",
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "dateOfLunch": "2019-09-03T18:48:15.499Z",
        "kcalForMain": 123,
        "veggie": false
    },
    {
        "BookingID": "9876543210987",
        "CanteenID": "9876543210987",
        "Dessert": null,
        "MainDish": "XYZ",
        "MenuID": "302",
        "Price": "98765432.98",
        "Sides": null,
        "Soup": null,
        "dateOfLunch": "2019-09-03T18:48:15.499Z",
        "kcalForMain": null,
        "veggie": null
    }
]
'''
