var assert = require('../node_modules/chai').assert;
var lessThanZero_check = require('../lessthanZero_test');
var negativeValue = '19-20';
var positiveValue = '20-19';
var zero = '0';

describe('Negative output test', function () {
  it('This functions checks if an expression evaluated is less than zero and returns 0 if the answer is a negative number', function () {
    assert.equal(lessThanZero_check(negativeValue), 0)
  });
});
describe('Positive output test', function () {
  it('This functions checks if an expression evaluated is less than zero and returns 1 if the answer is a positive number', function () {
    assert.equal(lessThanZero_check(positiveValue), 1)
  });
});
describe('Null output test', function () {
  it('This functions checks if an expression evaluated is less than zero and returns 1 if the answer is a positive number or zero', function () {
    assert.equal(lessThanZero_check(zero), 1)
  });
});
