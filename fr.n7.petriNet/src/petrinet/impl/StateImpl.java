/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.PetrinetPackage;
import petrinet.ReadArc;
import petrinet.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.StateImpl#getTokenNb <em>Token Nb</em>}</li>
 *   <li>{@link petrinet.impl.StateImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petrinet.impl.StateImpl#getReadArcs <em>Read Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NetworkElementImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenNb() <em>Token Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNb()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_NB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTokenNb() <em>Token Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNb()
	 * @generated
	 * @ordered
	 */
	protected int tokenNb = TOKEN_NB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getReadArcs() <em>Read Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadArc> readArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTokenNb() {
		return tokenNb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenNb(int newTokenNb) {
		int oldTokenNb = tokenNb;
		tokenNb = newTokenNb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.STATE__TOKEN_NB, oldTokenNb, tokenNb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.STATE__ARCS, PetrinetPackage.ARC__STATE);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadArc> getReadArcs() {
		if (readArcs == null) {
			readArcs = new EObjectWithInverseResolvingEList<ReadArc>(ReadArc.class, this, PetrinetPackage.STATE__READ_ARCS, PetrinetPackage.READ_ARC__STATE);
		}
		return readArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.STATE__ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcs()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.STATE__READ_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadArcs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.STATE__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.STATE__READ_ARCS:
				return ((InternalEList<?>)getReadArcs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.STATE__NAME:
				return getName();
			case PetrinetPackage.STATE__TOKEN_NB:
				return getTokenNb();
			case PetrinetPackage.STATE__ARCS:
				return getArcs();
			case PetrinetPackage.STATE__READ_ARCS:
				return getReadArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.STATE__TOKEN_NB:
				setTokenNb((Integer)newValue);
				return;
			case PetrinetPackage.STATE__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.STATE__READ_ARCS:
				getReadArcs().clear();
				getReadArcs().addAll((Collection<? extends ReadArc>)newValue);
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
			case PetrinetPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.STATE__TOKEN_NB:
				setTokenNb(TOKEN_NB_EDEFAULT);
				return;
			case PetrinetPackage.STATE__ARCS:
				getArcs().clear();
				return;
			case PetrinetPackage.STATE__READ_ARCS:
				getReadArcs().clear();
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
			case PetrinetPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.STATE__TOKEN_NB:
				return tokenNb != TOKEN_NB_EDEFAULT;
			case PetrinetPackage.STATE__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PetrinetPackage.STATE__READ_ARCS:
				return readArcs != null && !readArcs.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", tokenNb: ");
		result.append(tokenNb);
		result.append(')');
		return result.toString();
	}

} //StateImpl
