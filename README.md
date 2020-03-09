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

[Code](https://github.com/rajasekaranap/vendingmachine/tree/master/src/main/java/com/kgisl/raja/vendingmachine)

## Main Code

```java
package com.kgisl.raja.vendingmachine;

import com.kgisl.raja.vendingmachine.ProductFactory.ProductType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendingmachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendingmachineApplication.class, args);
		
		//MugSize
		Customization cust=new Customization();
		cust.setMugSize(1000.0);
		System.out.println("\n\n\n");
		Product pro1 = ProductFactory.getProductFactory(ProductType.CAPPUCCINO).getProduct(cust);
		pro1.make();

		Product pro2 = ProductFactory.getProductFactory(ProductType.BLACKCOFFEE).getProduct(cust);
		pro2.make();

		Product pro3 = ProductFactory.getProductFactory(ProductType.LEMONADE).getProduct(cust);
		pro3.make();

		Product pro4 = ProductFactory.getProductFactory(ProductType.HOTMILK).getProduct(cust);
		pro4.make();
		
		Product pro5 = ProductFactory.getProductFactory(ProductType.COCOCOLA).getProduct(cust);
		pro5.make();

		System.out.println("\n\n\n");
	}

}
```

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