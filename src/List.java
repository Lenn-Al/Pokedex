/**
 * Interface for a List
 * Das List-Interface, welches uns zur verfuegung
 * gestellt wurde. Zur Vollstaendigkeit stehen
 * hier wir als Author
 * @author Lennart Almstedt 4633202 Group 11d
 * @author Maximilian von Unwerth 4568393 Group 11d
 * @author Joshua Heinemann 4701655 Group 11d
 */
public interface List {
    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int length();

    /**
     * Retrieves, but does not remove, the first Pokemon of this list, or returns null if this list is empty.
     * @return the first Pokemon of this list, or null if this list is empty
     */
    Pokemon firstPokemon();

    /**
     * Inserts the specified Pokemon in this list.
     * @param p Pokemon to be inserted
     */
    void insert(Pokemon p);

    /**
     * Removes the first occurrence of the Pokemon from this list, if it is present.
     * @param p Pokemon to be removed from this list, if present
     */
    void delete(Pokemon p);
}