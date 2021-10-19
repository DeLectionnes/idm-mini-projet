/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.RessourceSupply#getQuantityNeeded <em>Quantity Needed</em>}</li>
 *   <li>{@link simplepdl.RessourceSupply#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link simplepdl.RessourceSupply#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessourceSupply()
 * @model
 * @generated
 */
public interface RessourceSupply extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantity Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Needed</em>' attribute.
	 * @see #setQuantityNeeded(int)
	 * @see simplepdl.SimplepdlPackage#getRessourceSupply_QuantityNeeded()
	 * @model required="true"
	 * @generated
	 */
	int getQuantityNeeded();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceSupply#getQuantityNeeded <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Needed</em>' attribute.
	 * @see #getQuantityNeeded()
	 * @generated
	 */
	void setQuantityNeeded(int value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getRessourceNeeded <em>Ressource Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessourceSupply_Successor()
	 * @see simplepdl.WorkDefinition#getRessourceNeeded
	 * @model opposite="ressourceNeeded" required="true"
	 * @generated
	 */
	WorkDefinition getSuccessor();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceSupply#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getLinkToSequence <em>Link To Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Ressource)
	 * @see simplepdl.SimplepdlPackage#getRessourceSupply_Predecessor()
	 * @see simplepdl.Ressource#getLinkToSequence
	 * @model opposite="linkToSequence" required="true"
	 * @generated
	 */
	Ressource getPredecessor();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceSupply#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Ressource value);

} // RessourceSupply
