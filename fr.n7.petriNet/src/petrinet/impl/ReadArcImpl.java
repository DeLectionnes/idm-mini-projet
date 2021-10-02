/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.PetrinetPackage;
import petrinet.ReadArc;
import petrinet.State;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ReadArcImpl#getTowardTransition <em>Toward Transition</em>}</li>
 *   <li>{@link petrinet.impl.ReadArcImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.impl.ReadArcImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadArcImpl extends NetworkElementImpl implements ReadArc {
	/**
	 * The default value of the '{@link #getTowardTransition() <em>Toward Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowardTransition()
	 * @generated
	 * @ordered
	 */
	protected static final int TOWARD_TRANSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTowardTransition() <em>Toward Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowardTransition()
	 * @generated
	 * @ordered
	 */
	protected int towardTransition = TOWARD_TRANSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.READ_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTowardTransition() {
		return towardTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTowardTransition(int newTowardTransition) {
		int oldTowardTransition = towardTransition;
		towardTransition = newTowardTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.READ_ARC__TOWARD_TRANSITION, oldTowardTransition, towardTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.READ_ARC__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.READ_ARC__TRANSITION, oldTransition, newTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject)transition).eInverseRemove(this, PetrinetPackage.TRANSITION__READ_ARCS, Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, PetrinetPackage.TRANSITION__READ_ARCS, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.READ_ARC__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.READ_ARC__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.READ_ARC__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, PetrinetPackage.STATE__READ_ARCS, State.class, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, PetrinetPackage.STATE__READ_ARCS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.READ_ARC__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.READ_ARC__TRANSITION:
				if (transition != null)
					msgs = ((InternalEObject)transition).eInverseRemove(this, PetrinetPackage.TRANSITION__READ_ARCS, Transition.class, msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
			case PetrinetPackage.READ_ARC__STATE:
				if (state != null)
					msgs = ((InternalEObject)state).eInverseRemove(this, PetrinetPackage.STATE__READ_ARCS, State.class, msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case PetrinetPackage.READ_ARC__TRANSITION:
				return basicSetTransition(null, msgs);
			case PetrinetPackage.READ_ARC__STATE:
				return basicSetState(null, msgs);
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
			case PetrinetPackage.READ_ARC__TOWARD_TRANSITION:
				return getTowardTransition();
			case PetrinetPackage.READ_ARC__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case PetrinetPackage.READ_ARC__STATE:
				if (resolve) return getState();
				return basicGetState();
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
			case PetrinetPackage.READ_ARC__TOWARD_TRANSITION:
				setTowardTransition((Integer)newValue);
				return;
			case PetrinetPackage.READ_ARC__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case PetrinetPackage.READ_ARC__STATE:
				setState((State)newValue);
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
			case PetrinetPackage.READ_ARC__TOWARD_TRANSITION:
				setTowardTransition(TOWARD_TRANSITION_EDEFAULT);
				return;
			case PetrinetPackage.READ_ARC__TRANSITION:
				setTransition((Transition)null);
				return;
			case PetrinetPackage.READ_ARC__STATE:
				setState((State)null);
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
			case PetrinetPackage.READ_ARC__TOWARD_TRANSITION:
				return towardTransition != TOWARD_TRANSITION_EDEFAULT;
			case PetrinetPackage.READ_ARC__TRANSITION:
				return transition != null;
			case PetrinetPackage.READ_ARC__STATE:
				return state != null;
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
		result.append(" (towardTransition: ");
		result.append(towardTransition);
		result.append(')');
		return result.toString();
	}

} //ReadArcImpl
