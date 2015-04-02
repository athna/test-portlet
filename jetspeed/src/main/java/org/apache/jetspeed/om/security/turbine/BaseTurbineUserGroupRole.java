package org.apache.jetspeed.om.security.turbine;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.util.Transaction;

  
    
    
  
/**
 * This class was autogenerated by Torque on:
 *
 * [Thu Jun 10 23:17:32 JST 2004]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to TurbineUserGroupRole
 */
public abstract class BaseTurbineUserGroupRole extends BaseObject
{
    /** The Peer class */
    private static final TurbineUserGroupRolePeer peer =
        new TurbineUserGroupRolePeer();

      
    /** The value for the userId field */
    private int userId;
      
    /** The value for the groupId field */
    private int groupId;
      
    /** The value for the roleId field */
    private int roleId;
  
  
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
    
                                  
                if (aTurbineUser != null && !(aTurbineUser.getUserId() == v))
                {
            aTurbineUser = null;
        }
      
              }

  
    /**
     * Get the GroupId
     * @return int
     */
    public int getGroupId()
    {
        return groupId;
    }

                              
    /**
     * Set the value of GroupId
     */
    public void setGroupId(int v ) throws TorqueException
    {
    
                  if (this.groupId != v)
              {
            this.groupId = v;
            setModified(true);
        }
    
                                  
                if (aTurbineGroup != null && !(aTurbineGroup.getGroupId() == v))
                {
            aTurbineGroup = null;
        }
      
              }

  
    /**
     * Get the RoleId
     * @return int
     */
    public int getRoleId()
    {
        return roleId;
    }

                              
    /**
     * Set the value of RoleId
     */
    public void setRoleId(int v ) throws TorqueException
    {
    
                  if (this.roleId != v)
              {
            this.roleId = v;
            setModified(true);
        }
    
                                  
                if (aTurbineRole != null && !(aTurbineRole.getRoleId() == v))
                {
            aTurbineRole = null;
        }
      
              }

  
      
        
                  
        private TurbineUser aTurbineUser;

    /**
     * Declares an association between this object and a TurbineUser object
     *
     * @param TurbineUser v
     */
    public void setTurbineUser(TurbineUser v) throws TorqueException
    {
            if (v == null)
        {
                  setUserId(0);
              }
        else
        {
            setUserId(v.getUserId());
        }
            aTurbineUser = v;
    }

                        
    public TurbineUser getTurbineUser() throws TorqueException
    {
        if ( getUserId()>0 )
        {
                return BaseTurbineUserManager.getInstance(SimpleKey.keyFor(getUserId()));
            }
        return aTurbineUser;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setTurbineUserKey(ObjectKey key) throws TorqueException
    {
    
                    setUserId(((NumberKey) key).intValue());
              }

  
        
                  
        private TurbineGroup aTurbineGroup;

    /**
     * Declares an association between this object and a TurbineGroup object
     *
     * @param TurbineGroup v
     */
    public void setTurbineGroup(TurbineGroup v) throws TorqueException
    {
            if (v == null)
        {
                  setGroupId(0);
              }
        else
        {
            setGroupId(v.getGroupId());
        }
            aTurbineGroup = v;
    }

                        
    public TurbineGroup getTurbineGroup() throws TorqueException
    {
        if ( getGroupId()>0 )
        {
                return BaseTurbineGroupManager.getInstance(SimpleKey.keyFor(getGroupId()));
            }
        return aTurbineGroup;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setTurbineGroupKey(ObjectKey key) throws TorqueException
    {
    
                    setGroupId(((NumberKey) key).intValue());
              }

  
        
                  
        private TurbineRole aTurbineRole;

    /**
     * Declares an association between this object and a TurbineRole object
     *
     * @param TurbineRole v
     */
    public void setTurbineRole(TurbineRole v) throws TorqueException
    {
            if (v == null)
        {
                  setRoleId(0);
              }
        else
        {
            setRoleId(v.getRoleId());
        }
            aTurbineRole = v;
    }

                        
    public TurbineRole getTurbineRole() throws TorqueException
    {
        if ( getRoleId()>0 )
        {
                return BaseTurbineRoleManager.getInstance(SimpleKey.keyFor(getRoleId()));
            }
        return aTurbineRole;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setTurbineRoleKey(ObjectKey key) throws TorqueException
    {
    
                    setRoleId(((NumberKey) key).intValue());
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
              fieldNames.add("GroupId");
              fieldNames.add("RoleId");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.
     */
    @Override
	public Object getByName(String name)
    {
          if (name.equals("UserId"))
        {
                return new Integer(getUserId());
            }
          if (name.equals("GroupId"))
        {
                return new Integer(getGroupId());
            }
          if (name.equals("RoleId"))
        {
                return new Integer(getRoleId());
            }
          return null;
    }
    
    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     */
    @Override
	public Object getByPeerName(String name)
    {
          if (name.equals(BaseTurbineUserGroupRolePeer.USER_ID ))
        {
                return new Integer(getUserId());
            }
          if (name.equals(BaseTurbineUserGroupRolePeer.GROUP_ID ))
        {
                return new Integer(getGroupId());
            }
          if (name.equals(BaseTurbineUserGroupRolePeer.ROLE_ID ))
        {
                return new Integer(getRoleId());
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     */
    @Override
	public Object getByPosition(int pos)
    {
            if ( pos == 0 )
        {
                return new Integer(getUserId());
            }
              if ( pos == 1 )
        {
                return new Integer(getGroupId());
            }
              if ( pos == 2 )
        {
                return new Integer(getRoleId());
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     */
    @Override
	public void save() throws Exception
    {
          save(BaseTurbineUserGroupRolePeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       */
    @Override
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
    @Override
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
                    BaseTurbineUserGroupRolePeer.doInsert((TurbineUserGroupRole)this, con);
                    setNew(false);
                }
                else
                {
                    BaseTurbineUserGroupRolePeer.doUpdate((TurbineUserGroupRole)this, con);
                }

                      if (isCacheOnSave())
                {
                    BaseTurbineUserGroupRoleManager.putInstance(this);
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

                                                                    
  
    private final SimpleKey[] pks = new SimpleKey[3];
    private final ComboKey comboPK = new ComboKey(pks);
    /**
     * Set the PrimaryKey with an ObjectKey
     */
    @Override
	public void setPrimaryKey(ObjectKey key) throws TorqueException
    {
        SimpleKey[] keys = (SimpleKey[]) key.getValue();
        SimpleKey tmpKey = null;
                      setUserId(((NumberKey)keys[0]).intValue());
                        setGroupId(((NumberKey)keys[1]).intValue());
                        setRoleId(((NumberKey)keys[2]).intValue());
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param int userId
         * @param int groupId
         * @param int roleId
         */
    public void setPrimaryKey( int userId, int groupId, int roleId)
        throws TorqueException 
    {
            setUserId(userId);
            setGroupId(groupId);
            setRoleId(roleId);
        }

    /**
     * Set the PrimaryKey using a String.
     */
    @Override
	public void setPrimaryKey(String key) throws TorqueException
    {
        setPrimaryKey(new ComboKey(key));
    }
  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    @Override
	public ObjectKey getPrimaryKey()
    {
              pks[0] = SimpleKey.keyFor(getUserId());
                  pks[1] = SimpleKey.keyFor(getGroupId());
                  pks[2] = SimpleKey.keyFor(getRoleId());
                  return comboPK;
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections.
       */
      public TurbineUserGroupRole copy() throws TorqueException
    {
        TurbineUserGroupRole copyObj = new TurbineUserGroupRole();
            copyObj.setUserId(userId);
          copyObj.setGroupId(groupId);
          copyObj.setRoleId(roleId);
  
                      copyObj.setUserId(0);
                                copyObj.setGroupId(0);
                                copyObj.setRoleId(0);
            
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public TurbineUserGroupRolePeer getPeer()
    {
        return peer;
    }
}
