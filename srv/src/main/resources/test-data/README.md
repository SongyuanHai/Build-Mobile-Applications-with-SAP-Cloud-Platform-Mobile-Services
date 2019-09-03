For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file BookingSet.json:

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

Sample test data for file CanteenSet.json:

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

Sample test data for file MenuSet.json:

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
        "dateOfLunch": "2019-09-03T18:48:15.500Z",
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
        "dateOfLunch": "2019-09-03T18:48:15.500Z",
        "kcalForMain": null,
        "veggie": null
    }
]
'''
