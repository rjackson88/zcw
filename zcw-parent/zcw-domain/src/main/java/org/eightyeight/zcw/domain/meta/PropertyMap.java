package org.eightyeight.zcw.domain.meta;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "propertyMap")
public abstract class PropertyMap extends MetaNodeEntity {
    
    public PropertyMap() {
    
    }
}
