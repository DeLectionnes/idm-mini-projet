/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.State#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.State#getTokenNb <em>Token Nb</em>}</li>
 *   <li>{@link petrinet.State#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petrinet.State#getReadArcs <em>Read Arcs</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getState()
 * @model
 * @generated
 */
public interface State extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Token Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Nb</em>' attribute.
	 * @see #setTokenNb(int)
	 * @see petrinet.PetrinetPackage#getState_TokenNb()
	 * @model required="true"
	 * @generated
	 */
	int getTokenNb();

	/**
	 * Sets the value of the '{@link petrinet.State#getTokenNb <em>Token Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Nb</em>' attribute.
	 * @see #getTokenNb()
	 * @generated
	 */
	void setTokenNb(int value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getState_Arcs()
	 * @see petrinet.Arc#getState
	 * @model opposite="state" required="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Read Arcs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.ReadArc}.
	 * It is bidirectional and its opposite is '{@link petrinet.ReadArc#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Arcs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getState_ReadArcs()
	 * @see petrinet.ReadArc#getState
	 * @model opposite="state"
	 * @generated
	 */
	EList<ReadArc> getReadArcs();

} // State
