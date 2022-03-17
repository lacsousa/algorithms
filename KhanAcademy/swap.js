var assert = require('assert');

var swap = function(array, firstIndex, secondIndex) {
	var temp;
	temp = array[firstIndex];
	array[firstIndex] = array[secondIndex];
	array[secondIndex] = temp;
};

var testArray = [7, 9, 4];
swap(testArray, 0, 1);
console.log(testArray);
assert.equal(testArray, [9, 7, 4]);

testArray = [7, 9, 4];
swap(testArray, 0, 2);
assert.equal(testArray, [4, 9, 7]);
//Program.assertEqual(testArray, [4, 9, 7]);

testArray = [7, 9, 4];
swap(testArray, 1, 2);
assert.equal(testArray, [7, 4, 9]);
//Program.assertEqual(testArray, [7, 4, 9]);