>> **http://localhost:8080/deats/markets**

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







