package org.skywalking.apm.collector.actor;

/**
 * @author pengys5
 */
public abstract class WorkerRef {
    private Role role;

    public WorkerRef(Role role) {
        this.role = role;
    }

    final public Role getRole() {
        return role;
    }

    public abstract void tell(Object message) throws Exception;
}
