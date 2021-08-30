export class Sort{

    constructor(){}

    sort = (array) =>{
        // console.log("sort")
        for(let i = 0 ; i < array.length ; i++){
            for(let j = i ; j < array.length ; j++){
                if(array[i] < array[j]){
                    let temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } // if
            } // 2st loop
        } //1st loop
    } //method


    printArray(...array){
        for(let i = 0 ; i < array.length ; i++){
            console.log(array[i]);
        }
    }
}