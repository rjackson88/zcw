package org.eightyeight.zcw.domain.universe.promotion;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "matchResult")
public class MatchResult extends MetaNodeEntity {
    
    public MatchResult() {
    
    }
}
