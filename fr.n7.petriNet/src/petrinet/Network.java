/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Network#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Network#getNetworkElement <em>Network Element</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Network Element</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.NetworkElement}.
	 * It is bidirectional and its opposite is '{@link petrinet.NetworkElement#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Element</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNetwork_NetworkElement()
	 * @see petrinet.NetworkElement#getNetwork
	 * @model opposite="network" containment="true"
	 * @generated
	 */
	EList<NetworkElement> getNetworkElement();

} // Network
