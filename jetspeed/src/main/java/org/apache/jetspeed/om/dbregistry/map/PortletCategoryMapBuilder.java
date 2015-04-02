package org.apache.jetspeed.om.dbregistry.map;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.adapter.IDMethod;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Thu Jun 10 23:17:32 JST 2004]
  *
  */
public class PortletCategoryMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.apache.jetspeed.om.dbregistry.map.PortletCategoryMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    @Override
	public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    @Override
	public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    @Override
	public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("default");

        dbMap.addTable("CATEGORY");
        TableMap tMap = dbMap.getTable("CATEGORY");

        tMap.setPrimaryKeyMethod(IDMethod.NATIVE);

        tMap.setPrimaryKeyMethodInfo("CATEGORY");

              tMap.addPrimaryKey("CATEGORY.ID", new Long(0));
                    tMap.addColumn("CATEGORY.NAME", new String());
                    tMap.addColumn("CATEGORY.GROUPE", new String());
                    tMap.addForeignKey(
                "CATEGORY.OWNER", new Long(0) , "PORTLET" ,
                "ID");
          }
}
