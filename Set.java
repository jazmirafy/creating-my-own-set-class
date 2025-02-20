import java.util.ArrayList; //i wanna use an array list instead of an array since i know i will be changing the size when i add or remove elements
//array lists are more flexible than array since arrays are a fixed size and array lists got more built in methods that help for this assignment

public class Set {
    // internal array list to store set elements
    //basically got this here so Integers of data type set can have the array list properties and i can use some of those built in methods for that
    private ArrayList<Integer> elements; //declaration
    //so now every time i say elements this is what im referring to essentially

    // default constructor
    public Set() { //constructor starting with empty set
        elements = new ArrayList<>(); //initialization
    }

    // constructor (allows you to initialize the set with elements)
    public Set(Integer[] initialElements) { //with this one u need to start with an array
        elements = new ArrayList<>(); //initialization
        for (Integer element : initialElements) { // easier for loop to add each element from array without having to do the for int and all that (since this is an arraylist i dont gotta worry about the i index like i do for arrays)
            if (!elements.contains(element)) { // avoid duplicates since set dont have two of the same element
                elements.add(element);
            }
        }
    }

    // find the union of two sets (returns all of the elements from set A and set B together)
    //union = or so it takes all elements of set a and all elements of set b and returns all of that
    public Set union(Set other) {
        Set result = new Set();
        result.elements.addAll(this.elements); // add all elements from this set
        for (Integer element : other.elements) { // add elements from other set avoiding duplicates
            if (!result.elements.contains(element)) { //if the element isnt a duplicate then we can add it
                result.elements.add(element);
            }
        }
        return result;
    }

    // find the intersection of two sets (returns all of the elements set A and B have in common) intersection = and
    public Set intersection(Set other) {
        Set result = new Set(); //this is where im gonna put all of the elements they have in common
        for (Integer element : this.elements) {
            if (other.elements.contains(element)) { // check if element is in both sets
                result.elements.add(element);// if the element is in both sets then ill add it to this new empty set
            }
        }
        return result; //return the new set
    }

    // find the difference of two sets (returns everything in set A that is not in set B)
    public Set difference(Set other) {
        Set result = new Set();
        for (Integer element : this.elements) {
            if (!other.elements.contains(element)) { // only add elements NOT in other set
                result.elements.add(element);
            }
        }
        return result;
    }

    // check whether a set is a subset (if all elements in set A are in set B, return true)
    public boolean isSubset(Set other) {
        for (Integer element : this.elements) {
            if (!other.elements.contains(element)) { // if ANY element in this set is not in other set, return false
                return false;
            }
        }
        return true; // all elements are in the other set
    }

    // isEmpty() (return true if the set is empty)
    public boolean isEmpty() {
        return elements.isEmpty(); //(is empty is a built in method in the array list thing so im just gonna resuse that here)
    }

    // isElement() (checks if the element is present in the set, if so return true)
    public boolean isElement(Integer element) {
        return elements.contains(element);
    }

    // isEqual() (check if all of the elements in set A are in set B, and vice versa)
    public boolean isEqual(Set other) {
        return this.isSubset(other) && other.isSubset(this); //if a is a subset of b and b is a subset of a then they are equal. so if both isSubset methods return true then is equal will return true too
    }
       //getCardinality()(return the number of elements in the set)
    public int getCardinality(){
       return this.elements.size(); //built in size method yayyy
    }
    public void clear(){
        this.elements.clear(); //java has a built in clear method for array list yay

    }
    public void addElement(Integer element){
        if(!this.elements.contains(element)) {//check and make sure its not a duplicate
        this.elements.add(element); //they got a built in add method yay
        }
    }
    //removeElement() (remove an element from the set)
    public void removeElement(Integer element){
        if(this.elements.contains(element)){//check if the element is even there before u try to remove it
        this.elements.remove(element);
        }
    }
    public Integer[] toArray(){
        return this.elements.toArray(new Integer[this.elements.size()]); //array list has built in to array method so my job is easy. getting it to make an array the size of the arraylist
    }

    // print da elements
    public void printElements() {
        System.out.println(elements);
    }
}