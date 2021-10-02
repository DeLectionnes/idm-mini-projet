/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getTowardState <em>Toward State</em>}</li>
 *   <li>{@link petrinet.Arc#getTowardTransition <em>Toward Transition</em>}</li>
 *   <li>{@link petrinet.Arc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.Arc#getState <em>State</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Toward State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toward State</em>' attribute.
	 * @see #setTowardState(int)
	 * @see petrinet.PetrinetPackage#getArc_TowardState()
	 * @model required="true"
	 * @generated
	 */
	int getTowardState();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTowardState <em>Toward State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toward State</em>' attribute.
	 * @see #getTowardState()
	 * @generated
	 */
	void setTowardState(int value);

	/**
	 * Returns the value of the '<em><b>Toward Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toward Transition</em>' attribute.
	 * @see #setTowardTransition(int)
	 * @see petrinet.PetrinetPackage#getArc_TowardTransition()
	 * @model required="true"
	 * @generated
	 */
	int getTowardTransition();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTowardTransition <em>Toward Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toward Transition</em>' attribute.
	 * @see #getTowardTransition()
	 * @generated
	 */
	void setTowardTransition(int value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petrinet.PetrinetPackage#getArc_Transition()
	 * @see petrinet.Transition#getArcs
	 * @model opposite="arcs" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.State#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see petrinet.PetrinetPackage#getArc_State()
	 * @see petrinet.State#getArcs
	 * @model opposite="arcs" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Arc
