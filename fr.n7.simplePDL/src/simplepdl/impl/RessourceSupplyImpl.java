/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplepdl.Ressource;
import simplepdl.RessourceSupply;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourceSupplyImpl#getQuantityNeeded <em>Quantity Needed</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceSupplyImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceSupplyImpl#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceSupplyImpl extends ProcessElementImpl implements RessourceSupply {
	/**
	 * The default value of the '{@link #getQuantityNeeded() <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_NEEDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantityNeeded() <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNeeded()
	 * @generated
	 * @ordered
	 */
	protected int quantityNeeded = QUANTITY_NEEDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition successor;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Ressource predecessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantityNeeded() {
		return quantityNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityNeeded(int newQuantityNeeded) {
		int oldQuantityNeeded = quantityNeeded;
		quantityNeeded = newQuantityNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_SUPPLY__QUANTITY_NEEDED, oldQuantityNeeded, quantityNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (WorkDefinition)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(WorkDefinition newSuccessor) {
		WorkDefinition oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR, oldSuccessor, successor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Ressource)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Ressource newPredecessor) {
		Ressource oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_SUPPLY__QUANTITY_NEEDED:
				return getQuantityNeeded();
			case SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
			case SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_SUPPLY__QUANTITY_NEEDED:
				setQuantityNeeded((Integer)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR:
				setSuccessor((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR:
				setPredecessor((Ressource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_SUPPLY__QUANTITY_NEEDED:
				setQuantityNeeded(QUANTITY_NEEDED_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR:
				setSuccessor((WorkDefinition)null);
				return;
			case SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR:
				setPredecessor((Ressource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_SUPPLY__QUANTITY_NEEDED:
				return quantityNeeded != QUANTITY_NEEDED_EDEFAULT;
			case SimplepdlPackage.RESSOURCE_SUPPLY__SUCCESSOR:
				return successor != null;
			case SimplepdlPackage.RESSOURCE_SUPPLY__PREDECESSOR:
				return predecessor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantityNeeded: ");
		result.append(quantityNeeded);
		result.append(')');
		return result.toString();
	}

} //RessourceSupplyImpl
