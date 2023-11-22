package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class glowingentities extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {
		/*
		Hier een simpele opmerking die niet in javadoc komt. Met ** komt hij wel in javadoc
		 */
		// Hier komt '1'
		System.out.println(1);
		// Hier komt 'Knock, knock'
		System.out.println("Knock, knock");
		// Hier komt 'Testknock'
		System.out.println("Test" + "knock");
		// Hier komt '2'
		System.out.println(1 + 1);
		// Hier komt 'test11'
		System.out.println("test" + 1 + 1);
		// Hier komt 'test2'
		System.out.println("test" + (1 + 1));
	}
	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the rightclicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
//	public void onRightClick(PlayerInteractEntityEvent event) {

//		if (event.getRightClicked().isGlowing() == true)
//			event.getRightClicked().setGlowing(false);
	//if (event.getRightClicked().getType() == EntityType.PIG)
	//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
//	}


	public void onRightClick2(PlayerInteractEntityEvent event) {

		event.getRightClicked().setGlowing(true);
	}

//	public void onRightClickOff(PlayerInteractEntityEvent event) {

//		if (event.getRightClicked().isGlowing() == true)
//			event.getRightClicked().setGlowing(false);
	//if (event.getRightClicked().getType() == EntityType.PIG)
	//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
//	}


}
