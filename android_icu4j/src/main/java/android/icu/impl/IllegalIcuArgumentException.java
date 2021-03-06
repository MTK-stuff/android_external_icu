/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 2009, Google, International Business Machines Corporation and         *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */
package android.icu.impl;

/**
 * @author markdavis
 * @hide Only a subset of ICU is exposed in Android
 *
 */
public class IllegalIcuArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = 3789261542830211225L;

    public IllegalIcuArgumentException(String errorMessage) {
        super(errorMessage);
    }
    
    public IllegalIcuArgumentException(Throwable cause) {
        super(cause);
    }
    
    public IllegalIcuArgumentException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
    
    public synchronized IllegalIcuArgumentException initCause(Throwable cause) {
        return (IllegalIcuArgumentException) super.initCause(cause);
    }
    
}
