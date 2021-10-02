/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.ReadArc#getTowardTransition <em>Toward Transition</em>}</li>
 *   <li>{@link petrinet.ReadArc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.ReadArc#getState <em>State</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getReadArc()
 * @model
 * @generated
 */
public interface ReadArc extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Toward Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toward Transition</em>' attribute.
	 * @see #setTowardTransition(int)
	 * @see petrinet.PetrinetPackage#getReadArc_TowardTransition()
	 * @model required="true"
	 * @generated
	 */
	int getTowardTransition();

	/**
	 * Sets the value of the '{@link petrinet.ReadArc#getTowardTransition <em>Toward Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toward Transition</em>' attribute.
	 * @see #getTowardTransition()
	 * @generated
	 */
	void setTowardTransition(int value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getReadArcs <em>Read Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petrinet.PetrinetPackage#getReadArc_Transition()
	 * @see petrinet.Transition#getReadArcs
	 * @model opposite="ReadArcs" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petrinet.ReadArc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.State#getReadArcs <em>Read Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see petrinet.PetrinetPackage#getReadArc_State()
	 * @see petrinet.State#getReadArcs
	 * @model opposite="ReadArcs" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link petrinet.ReadArc#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // ReadArc
