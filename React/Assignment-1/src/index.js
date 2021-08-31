import {Sort} from "./Sort";
import User from "./model/User";

var array = [5,2,6,24,10];

var sort = new Sort();
sort.sort(array);
sort.printArray(array);

var user = new User("Saad",24);

const {name,age} = user; // It should be with the same name as the properties defined in your class

console.log("[ name : "+name + ", age: "+age+" ]");