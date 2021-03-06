/**
 * generated by Xtext 2.12.0
 */
package co.edu.icesi.eketal.eketal.impl;

import co.edu.icesi.eketal.eketal.EketalPackage;
import co.edu.icesi.eketal.eketal.EventExpression;
import co.edu.icesi.eketal.eketal.EventPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.EventExpressionImpl#getTipoEvento <em>Tipo Evento</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.EventExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventExpressionImpl extends MinimalEObjectImpl.Container implements EventExpression
{
  /**
   * The cached value of the '{@link #getTipoEvento() <em>Tipo Evento</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoEvento()
   * @generated
   * @ordered
   */
  protected EventPredicate tipoEvento;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventExpressionImpl()
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
    return EketalPackage.Literals.EVENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventPredicate getTipoEvento()
  {
    return tipoEvento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoEvento(EventPredicate newTipoEvento, NotificationChain msgs)
  {
    EventPredicate oldTipoEvento = tipoEvento;
    tipoEvento = newTipoEvento;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO, oldTipoEvento, newTipoEvento);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoEvento(EventPredicate newTipoEvento)
  {
    if (newTipoEvento != tipoEvento)
    {
      NotificationChain msgs = null;
      if (tipoEvento != null)
        msgs = ((InternalEObject)tipoEvento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO, null, msgs);
      if (newTipoEvento != null)
        msgs = ((InternalEObject)newTipoEvento).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO, null, msgs);
      msgs = basicSetTipoEvento(newTipoEvento, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO, newTipoEvento, newTipoEvento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.EVENT_EXPRESSION__OP, oldOp, op));
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
      case EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO:
        return basicSetTipoEvento(null, msgs);
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
      case EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO:
        return getTipoEvento();
      case EketalPackage.EVENT_EXPRESSION__OP:
        return getOp();
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
      case EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO:
        setTipoEvento((EventPredicate)newValue);
        return;
      case EketalPackage.EVENT_EXPRESSION__OP:
        setOp((String)newValue);
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
      case EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO:
        setTipoEvento((EventPredicate)null);
        return;
      case EketalPackage.EVENT_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
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
      case EketalPackage.EVENT_EXPRESSION__TIPO_EVENTO:
        return tipoEvento != null;
      case EketalPackage.EVENT_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //EventExpressionImpl
