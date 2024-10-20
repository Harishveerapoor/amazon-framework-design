const{test,expect}=require('@playwright/test');
const { request } = require('http');

var userid;

test("get user",async({request})=>{

   const response= await request.get('https://reqres.in/api/users?page=2')
   console.log(await response.json())
   expect(response.status()).toBe(200)
});

test("create user",async({request})=>{

 const response =   await request.post('https://reqres.in/api/users',
   
               {
                       data:{
                        "name":"Harish",
                        "age":"23"
                       },
                       headers:{
                        "Accept":"application/json"
                       }

               });
               console.log(await response.json())
               expect(response.status()).toBe(201)

               var res= await response.json()  // purpose to store ID and used in put request
               userid=res.id
    
})

test("update user",async({request})=>{

    const response =   await request.put('https://reqres.in/api/users/'+userid,
   
        {
                data:{
                 "name":"Harish",
                 "age":"100"
                },
                headers:{
                 "Accept":"application/json"
                }

        });
        console.log(await response.json())
        expect(response.status()).toBe(200)

    
})

test("delete user",async({request})=>{
    
   const response= await request.delete('https://reqres.in/api/users/'+userid)
   expect (response.status()).toBe(204)

})
































//  npx playwright test 
//  npx playwright test tests/apitest.spec.js
//  npx playwright show-report