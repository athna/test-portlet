package org.apache.jetspeed.om.security.turbine;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;


/**
 * This class was autogenerated by Torque on:
 *
 * [Thu Jun 10 23:17:32 JST 2004]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to TurbineUser
 */
public abstract class BaseTurbineUser extends BaseObject
{
    /** The Peer class */
    private static final TurbineUserPeer peer =
        new TurbineUserPeer();

      
    /** The value for the userId field */
    private int userId;
      
    /** The value for the loginName field */
    private String loginName;
      
    /** The value for the passwordValue field */
    private String passwordValue;
      
    /** The value for the firstName field */
    private String firstName;
      
    /** The value for the lastName field */
    private String lastName;
      
    /** The value for the email field */
    private String email;
      
    /** The value for the confirmValue field */
    private String confirmValue;
      
    /** The value for the modified field */
    private Date modified;
      
    /** The value for the created field */
    private Date created;
      
    /** The value for the lastLogin field */
    private Date lastLogin;
      
    /** The value for the disabled field */
    private String disabled;
      
    /** The value for the objectdata field */
    private byte[] objectdata;
      
    /** The value for the passwordChanged field */
    private Date passwordChanged;
  
  
    /**
     * Get the UserId
     * @return int
     */
    public int getUserId()
    {
        return userId;
    }

                                              
    /**
     * Set the value of UserId
     */
    public void setUserId(int v ) throws TorqueException
    {
    
                  if (this.userId != v)
              {
            this.userId = v;
            setModified(true);
        }
    
          
                                  
        // update associated TurbineUserGroupRole
        if (collTurbineUserGroupRoles != null )
        {
            for (int i = 0; i < collTurbineUserGroupRoles.size(); i++)
            {
                ((TurbineUserGroupRole)collTurbineUserGroupRoles.get(i))
                        .setUserId(v);
            }
        }
                      }

  
    /**
     * Get the LoginName
     * @return String
     */
    public String getLoginName()
    {
        return loginName;
    }

                        
    /**
     * Set the value of LoginName
     */
    public void setLoginName(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.loginName, v))
              {
            this.loginName = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the PasswordValue
     * @return String
     */
    public String getPasswordValue()
    {
        return passwordValue;
    }

                        
    /**
     * Set the value of PasswordValue
     */
    public void setPasswordValue(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.passwordValue, v))
              {
            this.passwordValue = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the FirstName
     * @return String
     */
    public String getFirstName()
    {
        return firstName;
    }

                        
    /**
     * Set the value of FirstName
     */
    public void setFirstName(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.firstName, v))
              {
            this.firstName = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the LastName
     * @return String
     */
    public String getLastName()
    {
        return lastName;
    }

                        
    /**
     * Set the value of LastName
     */
    public void setLastName(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.lastName, v))
              {
            this.lastName = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the Email
     * @return String
     */
    public String getEmail()
    {
        return email;
    }

                        
    /**
     * Set the value of Email
     */
    public void setEmail(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.email, v))
              {
            this.email = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the ConfirmValue
     * @return String
     */
    public String getConfirmValue()
    {
        return confirmValue;
    }

                        
    /**
     * Set the value of ConfirmValue
     */
    public void setConfirmValue(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.confirmValue, v))
              {
            this.confirmValue = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the Modified
     * @return Date
     */
    public Date getModified()
    {
        return modified;
    }

                        
    /**
     * Set the value of Modified
     */
    public void setModified(Date v ) 
    {
    
                  if (!ObjectUtils.equals(this.modified, v))
              {
            this.modified = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the Created
     * @return Date
     */
    public Date getCreated()
    {
        return created;
    }

                        
    /**
     * Set the value of Created
     */
    public void setCreated(Date v ) 
    {
    
                  if (!ObjectUtils.equals(this.created, v))
              {
            this.created = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the LastLogin
     * @return Date
     */
    public Date getLastLogin()
    {
        return lastLogin;
    }

                        
    /**
     * Set the value of LastLogin
     */
    public void setLastLogin(Date v ) 
    {
    
                  if (!ObjectUtils.equals(this.lastLogin, v))
              {
            this.lastLogin = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the Disabled
     * @return String
     */
    public String getDisabled()
    {
        return disabled;
    }

                        
    /**
     * Set the value of Disabled
     */
    public void setDisabled(String v ) 
    {
    
                  if (!ObjectUtils.equals(this.disabled, v))
              {
            this.disabled = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the Objectdata
     * @return byte[]
     */
    public byte[] getObjectdata()
    {
        return objectdata;
    }

                        
    /**
     * Set the value of Objectdata
     */
    public void setObjectdata(byte[] v ) 
    {
    
                  if (!ObjectUtils.equals(this.objectdata, v))
              {
            this.objectdata = v;
            setModified(true);
        }
    
          
              }

  
    /**
     * Get the PasswordChanged
     * @return Date
     */
    public Date getPasswordChanged()
    {
        return passwordChanged;
    }

                        
    /**
     * Set the value of PasswordChanged
     */
    public void setPasswordChanged(Date v ) 
    {
    
                  if (!ObjectUtils.equals(this.passwordChanged, v))
              {
            this.passwordChanged = v;
            setModified(true);
        }
    
          
              }

  
         
                                
            
    /**
     * Collection to store aggregation of collTurbineUserGroupRoles
     */
    protected List collTurbineUserGroupRoles;

    /**
     * Temporary storage of collTurbineUserGroupRoles to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initTurbineUserGroupRoles()
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = new ArrayList();
        }
    }

            
    /**
     * Method called to associate a TurbineUserGroupRole object to this object
     * through the TurbineUserGroupRole foreign key attribute
     *
     * @param TurbineUserGroupRole l
     */
    public void addTurbineUserGroupRole(TurbineUserGroupRole l) throws TorqueException
    {
        getTurbineUserGroupRoles().add(l);
        l.setTurbineUser((TurbineUser)this);
    }

    /**
     * The criteria used to select the current contents of collTurbineUserGroupRoles
     */
    private Criteria lastTurbineUserGroupRolesCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTurbineUserGroupRoles(new Criteria())
     */
    public List getTurbineUserGroupRoles() throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = getTurbineUserGroupRoles(new Criteria(10));
        }
        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this TurbineUser has previously
     * been saved, it will retrieve related TurbineUserGroupRoles from storage.
     * If this TurbineUser is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     */
    public List getTurbineUserGroupRoles(Criteria criteria) throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               collTurbineUserGroupRoles = new ArrayList();
            }
            else
            {
                      criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                      collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                      criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                      if (!lastTurbineUserGroupRolesCriteria.equals(criteria))
                {
                    collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelect(criteria);
                }
            }
        }
        lastTurbineUserGroupRolesCriteria = criteria;

        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTurbineUserGroupRoles(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTurbineUserGroupRoles(Connection con) throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            collTurbineUserGroupRoles = getTurbineUserGroupRoles(new Criteria(10),con);
        }
        return collTurbineUserGroupRoles;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this TurbineUser has previously
     * been saved, it will retrieve related TurbineUserGroupRoles from storage.
     * If this TurbineUser is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTurbineUserGroupRoles(Criteria criteria,Connection con) throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               collTurbineUserGroupRoles = new ArrayList();
            }
            else
            {
                       criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                       collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelect(criteria,con);
             }
         }
         else
         {
             // criteria has no effect for a new object
             if (!isNew())
             {
                 // the following code is to determine if a new query is
                 // called for.  If the criteria is the same as the last
                 // one, just return the collection.
                     criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                     if (!lastTurbineUserGroupRolesCriteria.equals(criteria))
                 {
                     collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelect(criteria,con);
                 }
             }
         }
         lastTurbineUserGroupRolesCriteria = criteria;

         return collTurbineUserGroupRoles;
     }

                              

              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this TurbineUser is new, it will return
     * an empty collection; or if this TurbineUser has previously
     * been saved, it will retrieve related TurbineUserGroupRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in TurbineUser.
     */
    protected List getTurbineUserGroupRolesJoinTurbineUser(Criteria criteria)
        throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               collTurbineUserGroupRoles = new ArrayList();
            }
            else
            {
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                            collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineUser(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                        if (!lastTurbineUserGroupRolesCriteria.equals(criteria))
            {
                collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineUser(criteria);
            }
        }
        lastTurbineUserGroupRolesCriteria = criteria;

        return collTurbineUserGroupRoles;
    }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this TurbineUser is new, it will return
     * an empty collection; or if this TurbineUser has previously
     * been saved, it will retrieve related TurbineUserGroupRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in TurbineUser.
     */
    protected List getTurbineUserGroupRolesJoinTurbineGroup(Criteria criteria)
        throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               collTurbineUserGroupRoles = new ArrayList();
            }
            else
            {
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                            collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineGroup(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                        if (!lastTurbineUserGroupRolesCriteria.equals(criteria))
            {
                collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineGroup(criteria);
            }
        }
        lastTurbineUserGroupRolesCriteria = criteria;

        return collTurbineUserGroupRoles;
    }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this TurbineUser is new, it will return
     * an empty collection; or if this TurbineUser has previously
     * been saved, it will retrieve related TurbineUserGroupRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in TurbineUser.
     */
    protected List getTurbineUserGroupRolesJoinTurbineRole(Criteria criteria)
        throws TorqueException
    {
        if (collTurbineUserGroupRoles == null)
        {
            if (isNew())
            {
               collTurbineUserGroupRoles = new ArrayList();
            }
            else
            {
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                            collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineRole(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                            criteria.add(TurbineUserGroupRolePeer.USER_ID, getUserId() );
                        if (!lastTurbineUserGroupRolesCriteria.equals(criteria))
            {
                collTurbineUserGroupRoles = TurbineUserGroupRolePeer.doSelectJoinTurbineRole(criteria);
            }
        }
        lastTurbineUserGroupRolesCriteria = criteria;

        return collTurbineUserGroupRoles;
    }
                            


          
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("UserId");
              fieldNames.add("LoginName");
              fieldNames.add("PasswordValue");
              fieldNames.add("FirstName");
              fieldNames.add("LastName");
              fieldNames.add("Email");
              fieldNames.add("ConfirmValue");
              fieldNames.add("Modified");
              fieldNames.add("Created");
              fieldNames.add("LastLogin");
              fieldNames.add("Disabled");
              fieldNames.add("Objectdata");
              fieldNames.add("PasswordChanged");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.
     */
    public Object getByName(String name)
    {
          if (name.equals("UserId"))
        {
                return new Integer(getUserId());
            }
          if (name.equals("LoginName"))
        {
                return getLoginName();
            }
          if (name.equals("PasswordValue"))
        {
                return getPasswordValue();
            }
          if (name.equals("FirstName"))
        {
                return getFirstName();
            }
          if (name.equals("LastName"))
        {
                return getLastName();
            }
          if (name.equals("Email"))
        {
                return getEmail();
            }
          if (name.equals("ConfirmValue"))
        {
                return getConfirmValue();
            }
          if (name.equals("Modified"))
        {
                return getModified();
            }
          if (name.equals("Created"))
        {
                return getCreated();
            }
          if (name.equals("LastLogin"))
        {
                return getLastLogin();
            }
          if (name.equals("Disabled"))
        {
                return getDisabled();
            }
          if (name.equals("Objectdata"))
        {
                return getObjectdata();
            }
          if (name.equals("PasswordChanged"))
        {
                return getPasswordChanged();
            }
          return null;
    }
    
    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(TurbineUserPeer.USER_ID ))
        {
                return new Integer(getUserId());
            }
          if (name.equals(TurbineUserPeer.LOGIN_NAME ))
        {
                return getLoginName();
            }
          if (name.equals(TurbineUserPeer.PASSWORD_VALUE ))
        {
                return getPasswordValue();
            }
          if (name.equals(TurbineUserPeer.FIRST_NAME ))
        {
                return getFirstName();
            }
          if (name.equals(TurbineUserPeer.LAST_NAME ))
        {
                return getLastName();
            }
          if (name.equals(TurbineUserPeer.EMAIL ))
        {
                return getEmail();
            }
          if (name.equals(TurbineUserPeer.CONFIRM_VALUE ))
        {
                return getConfirmValue();
            }
          if (name.equals(TurbineUserPeer.MODIFIED ))
        {
                return getModified();
            }
          if (name.equals(TurbineUserPeer.CREATED ))
        {
                return getCreated();
            }
          if (name.equals(TurbineUserPeer.LAST_LOGIN ))
        {
                return getLastLogin();
            }
          if (name.equals(TurbineUserPeer.DISABLED ))
        {
                return getDisabled();
            }
          if (name.equals(TurbineUserPeer.OBJECTDATA ))
        {
                return getObjectdata();
            }
          if (name.equals(TurbineUserPeer.PASSWORD_CHANGED ))
        {
                return getPasswordChanged();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     */
    public Object getByPosition(int pos)
    {
            if ( pos == 0 )
        {
                return new Integer(getUserId());
            }
              if ( pos == 1 )
        {
                return getLoginName();
            }
              if ( pos == 2 )
        {
                return getPasswordValue();
            }
              if ( pos == 3 )
        {
                return getFirstName();
            }
              if ( pos == 4 )
        {
                return getLastName();
            }
              if ( pos == 5 )
        {
                return getEmail();
            }
              if ( pos == 6 )
        {
                return getConfirmValue();
            }
              if ( pos == 7 )
        {
                return getModified();
            }
              if ( pos == 8 )
        {
                return getCreated();
            }
              if ( pos == 9 )
        {
                return getLastLogin();
            }
              if ( pos == 10 )
        {
                return getDisabled();
            }
              if ( pos == 11 )
        {
                return getObjectdata();
            }
              if ( pos == 12 )
        {
                return getPasswordChanged();
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     */
    public void save() throws Exception
    {
          save(TurbineUserPeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    TurbineUserPeer.doInsert((TurbineUser)this, con);
                    setNew(false);
                }
                else
                {
                    TurbineUserPeer.doUpdate((TurbineUser)this, con);
                }

                      if (isCacheOnSave())
                {
                    TurbineUserManager.putInstance(this);
                }
              }

                                      
                            if (collTurbineUserGroupRoles != null )
            {
                for (int i = 0; i < collTurbineUserGroupRoles.size(); i++)
                {
                    ((TurbineUserGroupRole)collTurbineUserGroupRoles.get(i)).save(con);
                }
            }
                          alreadyInSave = false;
        }
      }

    /**
     * Specify whether to cache the object after saving to the db.
     * This method returns false
     */
    protected boolean isCacheOnSave()
    {
        return true;
    }

                        
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param ObjectKey userId
     */
    public void setPrimaryKey(ObjectKey userId)
        throws TorqueException {
            setUserId(((NumberKey)userId).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setUserId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getUserId());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections.
       */
      public TurbineUser copy() throws TorqueException
    {
        TurbineUser copyObj = new TurbineUser();
            copyObj.setUserId(userId);
          copyObj.setLoginName(loginName);
          copyObj.setPasswordValue(passwordValue);
          copyObj.setFirstName(firstName);
          copyObj.setLastName(lastName);
          copyObj.setEmail(email);
          copyObj.setConfirmValue(confirmValue);
          copyObj.setModified(modified);
          copyObj.setCreated(created);
          copyObj.setLastLogin(lastLogin);
          copyObj.setDisabled(disabled);
          copyObj.setObjectdata(objectdata);
          copyObj.setPasswordChanged(passwordChanged);
  
                      copyObj.setUserId(0);
                                                                                    
                                      
                
        List v = getTurbineUserGroupRoles();
        for (int i = 0; i < v.size(); i++)
        {
            TurbineUserGroupRole obj = (TurbineUserGroupRole) v.get(i);
            copyObj.addTurbineUserGroupRole(obj.copy());
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public TurbineUserPeer getPeer()
    {
        return peer;
    }
}
