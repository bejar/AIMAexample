package IA.ProbIA5;

import aima.search.framework.SuccessorFunction;
import aima.search.framework.Successor;
import java.util.ArrayList;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5SuccesorFunction implements SuccessorFunction{

    public ArrayList getSuccessors(Object state){
        ArrayList retval = new ArrayList();
        ProbIA5Board board = (ProbIA5Board) state;

        // Some code here
        // (flip all the consecutive pairs of coins and generate new states
        // Add the states to retval as Succesor(new_state, "Flip i, i+1")
        // new_state has to be a copy of state

        return retval;

    }

}