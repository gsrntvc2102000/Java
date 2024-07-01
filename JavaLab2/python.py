python

products = {}


# Loop to enter products and prices
while True:
    product_name = input("Enter product name (or 'done' to stop): ")
    if product_name == 'done':
        break
    product_price = float(input("Enter product price: "))
    products[product_name] = product_price


# Loop to search for products
while True:
    product_name = input("Enter product name to search (or 'done' to stop): ")
    if product_name == 'done':
        break
    if product_name in products:
        print(f"The price of {product_name} is {products[product_name]}")
    else:
        print(f"{product_name} is not in the dictionary")
