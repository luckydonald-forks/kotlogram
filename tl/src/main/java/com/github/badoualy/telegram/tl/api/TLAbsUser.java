package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLUser}: user#d10d979a</li>
 * <li>{@link TLUserEmpty}: userEmpty#200250ba</li>
 * </ul>
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public abstract class TLAbsUser extends TLObject {
    protected int id;

    public TLAbsUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLUser getAsUser() {
        return null;
    }
}
