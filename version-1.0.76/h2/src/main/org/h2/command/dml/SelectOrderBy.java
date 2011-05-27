/*
 * Copyright 2004-2008 H2 Group. Multiple-Licensed under the H2 License, 
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.command.dml;

import org.h2.expression.Expression;

/**
 * Describes one element of the ORDER BY clause of a query.
 */
public class SelectOrderBy {
    
    /**
     * The order by expression.
     */
    public Expression expression;
    
    /**
     * The column index expression. This can be a column index number (1 meaning
     * the first column of the select list) or a parameter (the parameter is a
     * number representing the column index number).
     */
    public Expression columnIndexExpr;
    
    /**
     * If the column should be sorted descending.
     */
    public boolean descending;
    
    /**
     * If NULL should be appear first.
     */
    public boolean nullsFirst;
    
    /**
     * If NULL should be appear at the end.
     */
    public boolean nullsLast;
}
