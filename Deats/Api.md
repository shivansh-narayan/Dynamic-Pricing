>> [http://localhost:8080/deats/markets]

`{
      "ans": [
          "Shahdara",
          "Keshopur",
          "Azadpur"
      ]
 }`

>>[http://localhost:8080/deats/grocers?marketName=Azadpur]

`{
     "ans": [
         "TheFarmStand",
         "The Farm Shop",
         "Farmopolis"
     ]
 }`
 
>>[http://localhost:8080/deats/products?groceryName=Sharma kirana&marketName=Shahdara]

`{
     "ans": [
         {
             "name": "Onion",
             "quantity": 52,
             "price": 15
         },
         {
             "name": "tomato",
             "quantity": 57,
             "price": 56
         },
         {
             "name": "rice",
             "quantity": 65,
             "price": 78
         },
         {
             "name": "wheat",
             "quantity": 21,
             "price": 12
         }
     ]
 }`
 
 >>[http://localhost:8080/deats/cart/present?cartId=5da8ab2d7d1820b0bddbf6aa]

`true`
 
 >>[http://localhost:8080/deats/cart/view?cartId=5da94f827d1820b0bddbf6ab]

`{
     "cartId": "5da94f827d1820b0bddbf6ab",
     "products": [
         {
             "name": "Rajma Chawal",
             "quantity": 78,
             "price": 45,
             "market": "Azadpur",
             "grocer": "TheFarmStand"
         }
     ]
 }`
 
 >>[http://localhost:8080/deats/cart/create?email=utk@gmail.com]

`{
     "cartId": "5da96a8172eba54634cbed7a",
     "email": "utk@gmail.com",
     "products": null
 }`
 
 
 {"Apple", "Banana", "rice", "wheat", "apple"};   ye product ka index hai
 
 >>[http://localhost:8080/deats/cart/add?cartId=5da94f827d1820b0bddbf6ab&productIndex=2&market=cvbnm&grocer=qunc&quantity=50]

`{
     "cartId": "5da94f827d1820b0bddbf6ab",
     "email": "narayanshivansh49@gmail.com",
     "products": [
         {
             "name": "Rajma Chawal",
             "quantity": 78,
             "price": 45,
             "market": "Azadpur",
             "grocer": "TheFarmStand"
         },
         {
             "name": "shsh",
             "quantity": 4,
             "price": 5,
             "market": "kasj",
             "grocer": "qunc"
         },
         {
             "name": "brownie",
             "quantity": 50,
             "price": 5,
             "market": "cvbnm",
             "grocer": "qunc"
         },
         {
             "name": "rice",
             "quantity": 50,
             "price": 0,
             "market": "cvbnm",
             "grocer": "qunc"
         }
     ]
 }`
 
>> [http://localhost:8080/deats/cart/remove?cartId=5da9897972eba53c8036c9e9&productIndex=0&market=aliganj&grocer=qwe&quantity=15] 

`{
     "cartId": "5da9897972eba53c8036c9e9",
     "email": "hk@gmail.com",
     "products": [
         {
             "name": "Onion",
             "quantity": 50,
             "price": 0,
             "market": "aliganj",
             "grocer": "qwe"
         }
     ]
 }`
 
 >> [http://localhost:8080/deats/cart/checkout?cartId=5da94f827d1820b0bddbf6ab]

`{
     "cartId": "5da94f827d1820b0bddbf6ab",
     "email": "narayanshivansh49@gmail.com",
     "products": null
 }`
 
 







