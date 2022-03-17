var swap = function(array, firstIndex, secondIndex) {
    var temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
};

var indexOfMinimum = function(array, startIndex) {

    var minValue = array[startIndex];
    var minIndex = startIndex;

    for(var i = minIndex + 1; i < array.length; i++) {
        if(array[i] < minValue) {
            minIndex = i;
            minValue = array[i];
        }
    } 
    return minIndex;
}; 

var selectionSort = function(array) {
  var menorIndice=0;

  for(var i=0; i< array.length; i++) {

    menorIndice = indexOfMinimum(array, i);
    swap(array, i, menorIndice );
  }
  return array;
};

var array = [22, 11, 99, 88, 9, 7, 42];
var assert = require('assert');

selectionSort(array);
console.log("Array after sorting:  " + array);

var array2= [100, 0, -4, 5, 37, 19, -1, 48];
selectionSort(array2);

//Program.assertEqual(array2, [-4, -1, 0, 5,19, 37, 48, 100]);

console.log("----------");
console.log("Array2 after sorting:  " + array2);


//assert.equal(array, [7, 9, 11, 22, 42, 88, 99]);
