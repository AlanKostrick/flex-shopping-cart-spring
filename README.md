## Project setup
- mkdir shopping-cart
- cd shopping-cart/
- gradle init --type java-application
- touch .gitignore
- touch README.md
- add code to the .gitignore
- include id 'eclipse' in the plugins section of build.gradle
- run gradle eclipse

## Project goals
- create `Item` class, `Cart` class and `App` class
	-Item will have a name, quantity and price
- `App` will talk to `Cart` which will talk to `Item`
- Be able to see the items you have in your cart
- Be able to add and remove items from cart in the user interface
- Be able to calculate total purchase price

## How to clone:
- git clone https://github.com/AlanKostrick/flex-shopping-cart-spring.git


## Stretch goals
- change quantity of an item that you want to purchase
- change to BigDecimal or use money formatter
- build out an interactive user interface with a menu of options
