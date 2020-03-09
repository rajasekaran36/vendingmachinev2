# Project Vending Machine

### Hints:
* Factory: Object Creator
* Abstract Factory: Factory Creator
* Advantage: Loose coupling

As a product user we don't need to take care instantiation parameters or logic for the preparation of drink it is taken care by factory.

We can and remove the product without affecting other products.

Improvements can be done:

* Customization and Preparation objects can be loosly copuled
* Fourmula can be dynamically loaded.
* API calls for adding and removing products dinamically.


## Sample Output

```console
Cappuccino Ready:
 Cup contains:
{ milk='500.0', water='null', sugar='200.0', coke='null', liquidCoffee='300.0', addedFlavour='null', tea='null'}
BlackCoffee Ready:
 Cup contains:
{ milk='null', water='500.0', sugar='null', coke='null', liquidCoffee='500.0', addedFlavour='null', tea='null'}
Lemonade Ready:
 Cup contains:
{ milk='null', water='600.0', sugar='200.0', coke='null', liquidCoffee='null', addedFlavour='200.0', tea='null'}
HotMilk Ready:
 Cup contains:
{ milk='1000.0', water='null', sugar='null', coke='null', liquidCoffee='null', addedFlavour='null', tea='null'}
CocaCola Ready:
 Cup contains:
{ milk='null', water='700.0', sugar='null', coke='300.0', liquidCoffee='null', addedFlavour='null', tea='null'}
```