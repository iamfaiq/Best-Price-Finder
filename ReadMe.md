##Description:

###This project is a clone of price comparison product websites, like cheapest flights, that gets prices from different websites. The program only simulates sending a query to a website and its getting prices from those websites for a product.

###The scenario given is: we've different flight agencies that we need to get a quote for a given flight.

###The output of the program is going to be:
###-notifying the user that the program is getting information from the imaginary websites (site1, site2, site3)
###-then as soon a website responds we give the quote to the user.
###Example output: Quote{site='site2', price=108}
###-finally, it prints the message: "Retrieved all quotes in # msec"

###The aim is to have all of the above to happen asynchronously because this imaginary websites may respond in different times. So we don't want to block the ui and wait for a response. So, as soon as we get a quote from a flight agency. We want to print it. 