package typingsSlinky.arangodb.Foxx

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.arangodb.anon.End
import typingsSlinky.std.FlatArray
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Array<{  start :number,   end :number}> & {  type :string} */
@js.native
trait Ranges extends /* n */ NumberDictionary[End] {
  
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    */
  def concat(items: (js.Array[End] | End)*): js.Array[End] = js.native
  
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: Double, start: Double): this.type = js.native
  def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
  
  /**
    * Returns an iterable of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[Double, End]] = js.native
  
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def every(predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _]): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("every")
  def every_S_End[S /* <: End */](
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], /* is S */ Boolean]
  ): /* is std.Array<S> */ Boolean = js.native
  @JSName("every")
  def every_S_End[S /* <: End */](
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], /* is S */ Boolean],
    thisArg: js.Any
  ): /* is std.Array<S> */ Boolean = js.native
  
  /**
    * Returns the this object after filling the section identified by start and end with value
    * @param value value to fill array section with
    * @param start index to start filling the array at. If start is negative, it is treated as
    * length+start where length is the length of the array.
    * @param end index to stop filling the array at. If end is negative, it is treated as
    * length+end.
    */
  def fill(value: End): this.type = js.native
  def fill(value: End, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
  def fill(value: End, start: Double): this.type = js.native
  def fill(value: End, start: Double, end: Double): this.type = js.native
  
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
    */
  def filter(predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _]): js.Array[End] = js.native
  def filter(
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _],
    thisArg: js.Any
  ): js.Array[End] = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("filter")
  def filter_S_End[S /* <: End */](
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], /* is S */ Boolean]
  ): js.Array[S] = js.native
  @JSName("filter")
  def filter_S_End[S /* <: End */](
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], /* is S */ Boolean],
    thisArg: js.Any
  ): js.Array[S] = js.native
  
  def find(predicate: js.Function3[/* value */ End, /* index */ Double, /* obj */ js.Array[End], _]): js.UndefOr[End] = js.native
  def find(
    predicate: js.Function3[/* value */ End, /* index */ Double, /* obj */ js.Array[End], _],
    thisArg: js.Any
  ): js.UndefOr[End] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find[S /* <: End */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ End, 
      /* index */ Double, 
      /* obj */ js.Array[End], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  def find[S /* <: End */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ End, 
      /* index */ Double, 
      /* obj */ js.Array[End], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
  
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ End, /* index */ Double, /* obj */ js.Array[End], _]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ End, /* index */ Double, /* obj */ js.Array[End], _],
    thisArg: js.Any
  ): Double = js.native
  
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
  def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
  
  /**
    * Calls a defined callback function on each element of an array. Then, flattens the result into
    * a new array.
    * This is identical to a map followed by flat with depth 1.
    *
    * @param callback A function that accepts up to three arguments. The flatMap method calls the
    * callback function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If
    * thisArg is omitted, undefined is used as the this value.
    */
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ End, 
      /* index */ Double, 
      /* array */ js.Array[End], 
      U | js.Array[U]
    ]
  ): js.Array[U] = js.native
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ End, 
      /* index */ Double, 
      /* array */ js.Array[End], 
      U | js.Array[U]
    ],
    thisArg: This
  ): js.Array[U] = js.native
  
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(callbackfn: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: End): Boolean = js.native
  def includes(searchElement: End, fromIndex: Double): Boolean = js.native
  
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: End): Double = js.native
  def indexOf(searchElement: End, fromIndex: Double): Double = js.native
  
  /** Iterator */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[End]] = js.native
  
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  /**
    * Returns an iterable of keys in the array
    */
  def keys(): IterableIterator[Double] = js.native
  
  /**
    * Returns the index of the last occurrence of a specified value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
    */
  def lastIndexOf(searchElement: End): Double = js.native
  def lastIndexOf(searchElement: End, fromIndex: Double): Double = js.native
  
  /**
    * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
    */
  var length: Double = js.native
  
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](callbackfn: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], U]): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  
  /**
    * Removes the last element from an array and returns it.
    */
  def pop(): js.UndefOr[End] = js.native
  
  /**
    * Appends new elements to an array, and returns the new length of the array.
    * @param items New elements of the Array.
    */
  def push(items: End*): Double = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ End, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      End
    ]
  ): End = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ End, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      End
    ],
    initialValue: End
  ): End = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ End, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      End
    ]
  ): End = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ End, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      End
    ],
    initialValue: End
  ): End = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ End, 
      /* currentIndex */ Double, 
      /* array */ js.Array[End], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): js.Array[End] = js.native
  
  /**
    * Removes the first element from an array and returns it.
    */
  def shift(): js.UndefOr[End] = js.native
  
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
    */
  def slice(): js.Array[End] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[End] = js.native
  def slice(start: Double): js.Array[End] = js.native
  def slice(start: Double, end: Double): js.Array[End] = js.native
  
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param predicate A function that accepts up to three arguments. The some method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def some(predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _]): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ End, /* index */ Double, /* array */ js.Array[End], _],
    thisArg: js.Any
  ): Boolean = js.native
  
  /**
    * Sorts an array.
    * @param compareFn Function used to determine the order of the elements. It is expected to return
    * a negative value if first argument is less than second argument, zero if they're equal and a positive
    * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
    * ```ts
    * [11,2,22,1].sort((a, b) => a - b)
    * ```
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ End, /* b */ End, Double]): this.type = js.native
  
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    */
  def splice(start: Double): js.Array[End] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[End] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: Double, deleteCount: Double, items: End*): js.Array[End] = js.native
  
  var `type`: String = js.native
  
  /**
    * Returns an object whose properties have the value 'true'
    * when they will be absent when used in a 'with' statement.
    */
  @JSName(js.Symbol.unscopables)
  var unscopables: js.Function0[CopyWithin] = js.native
  
  /**
    * Inserts new elements at the start of an array.
    * @param items  Elements to insert at the start of the Array.
    */
  def unshift(items: End*): Double = js.native
  
  /**
    * Returns an iterable of values in the array
    */
  def values(): IterableIterator[End] = js.native
}
