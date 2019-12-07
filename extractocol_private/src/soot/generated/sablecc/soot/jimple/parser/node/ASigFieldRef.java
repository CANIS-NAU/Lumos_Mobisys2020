/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ASigFieldRef extends PFieldRef
{
    private PFieldSignature _fieldSignature_;

    public ASigFieldRef()
    {
        // Constructor
    }

    public ASigFieldRef(
        @SuppressWarnings("hiding") PFieldSignature _fieldSignature_)
    {
        // Constructor
        setFieldSignature(_fieldSignature_);

    }

    @Override
    public Object clone()
    {
        return new ASigFieldRef(
            cloneNode(this._fieldSignature_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASigFieldRef(this);
    }

    public PFieldSignature getFieldSignature()
    {
        return this._fieldSignature_;
    }

    public void setFieldSignature(PFieldSignature node)
    {
        if(this._fieldSignature_ != null)
        {
            this._fieldSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldSignature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldSignature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldSignature_ == child)
        {
            this._fieldSignature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fieldSignature_ == oldChild)
        {
            setFieldSignature((PFieldSignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
