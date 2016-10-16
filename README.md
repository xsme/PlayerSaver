PlayerSaver
==================
Very simple plugin - once every given amount of time it forces saving all online players equipment, position, etc. into file (username.dat located in world/players directory).

Configuration - config.yml
----------------------------
You can set your own saving interval using configuration file that is generated at first run. You can find two values: interval (set in seconds), and permissions (true/false). Default is `60` seconds for interval, and `false` for permissions (if you set false, all players will be saved). This timer is common for all players, not individual per player.
```
interval: 60
permissions: false
```

Permissions
----------------
If you want to use extended permissions plugin, first change in `config.yml` permissions value to true. In order to save player file he/she must have set permission named `playersaver.save` to true (default is false).

Bugs
----------------
None as far as I known.