/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.NetworkElement#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNetworkElement()
 * @model
 * @generated
 */
public interface NetworkElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Network#getNetworkElement <em>Network Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(Network)
	 * @see petrinet.PetrinetPackage#getNetworkElement_Network()
	 * @see petrinet.Network#getNetworkElement
	 * @model opposite="networkElement" required="true" transient="false"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link petrinet.NetworkElement#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);
} // NetworkElement
