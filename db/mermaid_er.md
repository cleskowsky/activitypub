```mermaid
erDiagram
    users {
        bigint id
        string username
        string password
        string fullname
        string introduction
        datetime last_seen
        int login_attempts
        datetime created_at
        datetime updated_at
    }

    objects {
        bigint id
        bigint actor_id
        bigint parent_id
        datetime created_at
        datetime updated_at
    }

    actors {
        bigint id
        bigint user_id
        datetime created_at
        datetime updated_at
    }

    actor_following {
        bigint actor_id
        bigint target_actor_id
        datetime created_at
        datetime updated_at
    }
```

# Notes

* A user is local to the system, and also a fediverse actor
* A user can establish an authenticated session and be authorized to publish, manage, etc objects / other entities in the system
* An actor is not necessarily a user