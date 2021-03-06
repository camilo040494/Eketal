/**
 * generated by Xtext 2.12.0
 */
package co.edu.icesi.eketal.eketal.impl;

import co.edu.icesi.eketal.eketal.EketalPackage;
import co.edu.icesi.eketal.eketal.Group;
import co.edu.icesi.eketal.eketal.KindAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.KindAttributeImpl#getHostgroup <em>Hostgroup</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.KindAttributeImpl#getOngroup <em>Ongroup</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.KindAttributeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindAttributeImpl extends EventPredicateImpl implements KindAttribute
{
  /**
   * The cached value of the '{@link #getHostgroup() <em>Hostgroup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostgroup()
   * @generated
   * @ordered
   */
  protected Group hostgroup;

  /**
   * The cached value of the '{@link #getOngroup() <em>Ongroup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOngroup()
   * @generated
   * @ordered
   */
  protected Group ongroup;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected XExpression condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KindAttributeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EketalPackage.Literals.KIND_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group getHostgroup()
  {
    if (hostgroup != null && hostgroup.eIsProxy())
    {
      InternalEObject oldHostgroup = (InternalEObject)hostgroup;
      hostgroup = (Group)eResolveProxy(oldHostgroup);
      if (hostgroup != oldHostgroup)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EketalPackage.KIND_ATTRIBUTE__HOSTGROUP, oldHostgroup, hostgroup));
      }
    }
    return hostgroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group basicGetHostgroup()
  {
    return hostgroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostgroup(Group newHostgroup)
  {
    Group oldHostgroup = hostgroup;
    hostgroup = newHostgroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.KIND_ATTRIBUTE__HOSTGROUP, oldHostgroup, hostgroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group getOngroup()
  {
    if (ongroup != null && ongroup.eIsProxy())
    {
      InternalEObject oldOngroup = (InternalEObject)ongroup;
      ongroup = (Group)eResolveProxy(oldOngroup);
      if (ongroup != oldOngroup)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EketalPackage.KIND_ATTRIBUTE__ONGROUP, oldOngroup, ongroup));
      }
    }
    return ongroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group basicGetOngroup()
  {
    return ongroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOngroup(Group newOngroup)
  {
    Group oldOngroup = ongroup;
    ongroup = newOngroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.KIND_ATTRIBUTE__ONGROUP, oldOngroup, ongroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(XExpression newCondition, NotificationChain msgs)
  {
    XExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EketalPackage.KIND_ATTRIBUTE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(XExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EketalPackage.KIND_ATTRIBUTE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EketalPackage.KIND_ATTRIBUTE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.KIND_ATTRIBUTE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EketalPackage.KIND_ATTRIBUTE__CONDITION:
        return basicSetCondition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EketalPackage.KIND_ATTRIBUTE__HOSTGROUP:
        if (resolve) return getHostgroup();
        return basicGetHostgroup();
      case EketalPackage.KIND_ATTRIBUTE__ONGROUP:
        if (resolve) return getOngroup();
        return basicGetOngroup();
      case EketalPackage.KIND_ATTRIBUTE__CONDITION:
        return getCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EketalPackage.KIND_ATTRIBUTE__HOSTGROUP:
        setHostgroup((Group)newValue);
        return;
      case EketalPackage.KIND_ATTRIBUTE__ONGROUP:
        setOngroup((Group)newValue);
        return;
      case EketalPackage.KIND_ATTRIBUTE__CONDITION:
        setCondition((XExpression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EketalPackage.KIND_ATTRIBUTE__HOSTGROUP:
        setHostgroup((Group)null);
        return;
      case EketalPackage.KIND_ATTRIBUTE__ONGROUP:
        setOngroup((Group)null);
        return;
      case EketalPackage.KIND_ATTRIBUTE__CONDITION:
        setCondition((XExpression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EketalPackage.KIND_ATTRIBUTE__HOSTGROUP:
        return hostgroup != null;
      case EketalPackage.KIND_ATTRIBUTE__ONGROUP:
        return ongroup != null;
      case EketalPackage.KIND_ATTRIBUTE__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

} //KindAttributeImpl
