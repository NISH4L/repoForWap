window.onload = function(){
    //Using strict rule
    "use strict";


//For question #1
 const person = {
     name: "", 
     dateOfBirth: "",
     salary : 0,
     jobTitle:"",
     doJob: function(jobTitle){
      this.jobTitle = jobTitle;
     },
     getName: function(){
         return this.name;
     },
     setName: function(name){
          this.name=name;
     },

     getPerInfo:function(){
      console.log(`The Person's name is ${this.name}`);
      console.log(`${this.name} was born on ${this.dateOfBirth}`);
     },
     getEmpInfo: function(){
      console.log(`${this.name} is a ${this.jobTitle} who earns $${this.salary}`);
      
     }
  };
  
  const person1 = Object.create(person);
  person1.setName("John");
  person1.dateOfBirth = "1998-12-10";
  person1.getPerInfo();






//For Question#2


  const employee = Object.create(person);

  employee.setName("Anna");
  employee.salary = ("249,995.50");
  employee.doJob("Programmer")

  employee.getEmpInfo();


//For Question#3

  function Person(name,dateOfBirth){
      this.name = name;
      this.dateOfBirth=dateOfBirth;
  }
  Person.prototype.toString = function(){
      console.log(`{Name: ${this.name}, DateOfBirth: ${this.dateOfBirth}}`);
      
  }
  const person2 = new Person("Peter","1985-11-10");
  person2.toString();


}