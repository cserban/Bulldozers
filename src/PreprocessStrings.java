import java.util.Set;
import java.util.TreeSet;


public class PreprocessStrings {
	public static String decodeUsageBand(String produceSize) {
		if(produceSize.equalsIgnoreCase("high"))
			return "4";
		if(produceSize.equalsIgnoreCase("medium"))
			return "3";
		if(produceSize.equalsIgnoreCase("low"))
			return "2";
		if(produceSize.equalsIgnoreCase("none"))
			return "1";
		return "0";
	}

	public static String decodeProductSize(String produceSize) {
		if(produceSize.equalsIgnoreCase("Large"))
			return "3";
		if(produceSize.equalsIgnoreCase("Medium"))
			return "2";
		if(produceSize.equalsIgnoreCase("Compact"))
			return "1";
		return "0";
	}

	public static String decodeProductSizeTEX(String productSize) {
		if(productSize.equalsIgnoreCase("Mini")) {
			return "1";
		}
		if(productSize.equalsIgnoreCase("Small")) {
			return "2";
		}
		if(productSize.equalsIgnoreCase("Large / Medium")) {
			return "3";
		}
		return "0";
	}

	public static String decodeProductClassWL(String productClass) {
		if(productClass.equalsIgnoreCase("Wheel Loader - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Wheel Loader - 0.0 to 40.0 Horsepower"))
			return "1";
		if(productClass.equalsIgnoreCase("Wheel Loader - 40.0 to 60.0 Horsepower"))
			return "2";
		if(productClass.equalsIgnoreCase("Wheel Loader - 60.0 to 80.0 Horsepower"))
			return "3";
		if(productClass.equalsIgnoreCase("Wheel Loader - 80.0 to 90.0 Horsepower"))
			return "4";
		if(productClass.equalsIgnoreCase("Wheel Loader - 90.0 to 100.0 Horsepower"))
			return "5";
		if(productClass.equalsIgnoreCase("Wheel Loader - 100.0 to 110.0 Horsepower"))
			return "6";
		if(productClass.equalsIgnoreCase("Wheel Loader - 110.0 to 120.0 Horsepower"))
			return "7";
		if(productClass.equalsIgnoreCase("Wheel Loader - 120.0 to 135.0 Horsepower"))
			return "8";
		if(productClass.equalsIgnoreCase("Wheel Loader - 135.0 to 150.0 Horsepower"))
			return "9";
		if(productClass.equalsIgnoreCase("Wheel Loader - 150.0 to 175.0 Horsepower"))
			return "10";
		if(productClass.equalsIgnoreCase("Wheel Loader - 175.0 to 200.0 Horsepower"))
			return "11";
		if(productClass.equalsIgnoreCase("Wheel Loader - 200.0 to 225.0 Horsepower"))
			return "12";
		if(productClass.equalsIgnoreCase("Wheel Loader - 225.0 to 250.0 Horsepower"))
			return "13";
		if(productClass.equalsIgnoreCase("Wheel Loader - 250.0 to 275.0 Horsepower"))
			return "14";
		if(productClass.equalsIgnoreCase("Wheel Loader - 275.0 to 350.0 Horsepower"))
			return "15";
		if(productClass.equalsIgnoreCase("Wheel Loader - 350.0 to 500.0 Horsepower"))
			return "16";
		if(productClass.equalsIgnoreCase("Wheel Loader - 500.0 to 1000.0 Horsepower"))
			return "17";
		if(productClass.equalsIgnoreCase("Wheel Loader - 1000.0 + Horsepower"))
			return "18";
		return "-1";
	}

	public static String decodeProductClassSSL(String productClass) {
		if(productClass.equalsIgnoreCase("Skid Steer Loader - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 0.0 to 701.0 Lb Operating Capacity"))
			return "1";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 701.0 to 976.0 Lb Operating Capacity"))
			return "2";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 976.0 to 1251.0 Lb Operating Capacity"))
			return "3";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 1251.0 to 1351.0 Lb Operating Capacity"))
			return "4";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 1351.0 to 1601.0 Lb Operating Capacity"))
			return "5";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 1601.0 to 1751.0 Lb Operating Capacity"))
			return "6";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 1751.0 to 2201.0 Lb Operating Capacity"))
			return "7";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 2201.0 to 2701.0 Lb Operating Capacity"))
			return "8";
		if(productClass.equalsIgnoreCase("Skid Steer Loader - 2701.0+ Lb Operating Capacity"))
			return "9";
		return "-1";
	}

	public static String decodeProductClassBL(String productClass) {
		if(productClass.equalsIgnoreCase("Backhoe Loader - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Backhoe Loader - 0.0 to 14.0 Ft Standard Digging Depth"))
			return "1";
		if(productClass.equalsIgnoreCase("Backhoe Loader - 14.0 to 15.0 Ft Standard Digging Depth"))
			return "2";
		if(productClass.equalsIgnoreCase("Backhoe Loader - 15.0 to 16.0 Ft Standard Digging Depth"))
			return "3";
		if(productClass.equalsIgnoreCase("Backhoe Loader - 16.0 + Ft Standard Digging Depth"))
			return "4";
		System.out.println("HAHA " + productClass);
		return "-1";
	}

	public static String decodeProductClassMG(String productClass) {
		if(productClass.equalsIgnoreCase("Motorgrader - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Motorgrader - 45.0 to 130.0 Horsepower"))
			return "1";
		if(productClass.equalsIgnoreCase("Motorgrader - 130.0 to 145.0 Horsepower"))
			return "2";
		if(productClass.equalsIgnoreCase("Motorgrader - 145.0 to 170.0 Horsepower"))
			return "3";
		if(productClass.equalsIgnoreCase("Motorgrader - 170.0 to 200.0 Horsepower"))
			return "4";
		if(productClass.equalsIgnoreCase("Motorgrader - 200.0 + Horsepower"))
			return "5";
		System.out.println("HAHA " + productClass);
		return "-1";
	}

	public static String decodeProductClassTEX(String productClass) {
		if(productClass.equalsIgnoreCase("Track - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Track - 0.0 to 2.0 Metric Tons"))
			return "1";
		if(productClass.equalsIgnoreCase("Track - 2.0 to 3.0 Metric Tons"))
			return "2";
		if(productClass.equalsIgnoreCase("Track - 3.0 to 4.0 Metric Tons"))
			return "3";
		if(productClass.equalsIgnoreCase("Track - 4.0 to 5.0 Metric Tons"))
			return "4";
		if(productClass.equalsIgnoreCase("Track - 5.0 to 6.0 Metric Tons"))
			return "5";
		if(productClass.equalsIgnoreCase("Track - 6.0 to 8.0 Metric Tons"))
			return "6";
		if(productClass.equalsIgnoreCase("Track - 8.0 to 11.0 Metric Tons"))
			return "7";
		if(productClass.equalsIgnoreCase("Track - 11.0 to 12.0 Metric Tons"))
			return "8";
		if(productClass.equalsIgnoreCase("Track - 12.0 to 14.0 Metric Tons"))
			return "9";
		if(productClass.equalsIgnoreCase("Track - 14.0 to 16.0 Metric Tons"))
			return "10";
		if(productClass.equalsIgnoreCase("Track - 16.0 to 19.0 Metric Tons"))
			return "11";
		if(productClass.equalsIgnoreCase("Track - 19.0 to 21.0 Metric Tons"))
			return "12";
		if(productClass.equalsIgnoreCase("Track - 21.0 to 24.0 Metric Tons"))
			return "13";
		if(productClass.equalsIgnoreCase("Track - 24.0 to 28.0 Metric Tons"))
			return "14";
		if(productClass.equalsIgnoreCase("Track - 28.0 to 33.0 Metric Tons"))
			return "15";
		if(productClass.equalsIgnoreCase("Track - 33.0 to 40.0 Metric Tons"))
			return "16";
		if(productClass.equalsIgnoreCase("Track - 40.0 to 50.0 Metric Tons"))
			return "17";
		if(productClass.equalsIgnoreCase("Track - 50.0 to 66.0 Metric Tons"))
			return "18";
		if(productClass.equalsIgnoreCase("Track - 66.0 to 90.0 Metric Tons"))
			return "19";
		if(productClass.equalsIgnoreCase("Track - 90.0 to 150.0 Metric Tons"))
			return "20";
		if(productClass.equalsIgnoreCase("Track - 150.0 to 300.0 Metric Tons"))
			return "21";
		if(productClass.equalsIgnoreCase("Track - 300.0 + Metric Tons"))
			return "22";

		System.out.println("HAHA >" + productClass+"<");
		return "-1";
	}

	public static String decodeProductClassTTT(String productClass) {
		if(productClass.equalsIgnoreCase("Dozer - Unidentified"))
			return "0";
		if(productClass.equalsIgnoreCase("Dozer - 20.0 to 75.0 Horsepower"))
			return "1";
		if(productClass.equalsIgnoreCase("Dozer - 75.0 to 85.0 Horsepower"))
			return "2";
		if(productClass.equalsIgnoreCase("Dozer - 85.0 to 105.0 Horsepower"))
			return "3";
		if(productClass.equalsIgnoreCase("Dozer - 105.0 to 130.0 Horsepower"))
			return "4";
		if(productClass.equalsIgnoreCase("Dozer - 130.0 to 160.0 Horsepower"))
			return "5";
		if(productClass.equalsIgnoreCase("Dozer - 160.0 to 190.0 Horsepower"))
			return "6";
		if(productClass.equalsIgnoreCase("Dozer - 190.0 to 260.0 Horsepower"))
			return "7";
		if(productClass.equalsIgnoreCase("Dozer - 260.0 + Horsepower"))
			return "8";
		System.out.println("HAHA >" + productClass+"<");
		return "-1";
	}

	public static String decodeDriveSystem(String driveSystem) {
		if(driveSystem.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(driveSystem.equalsIgnoreCase("Two Wheel Drive"))
			return "1";
		if(driveSystem.equalsIgnoreCase("Four Wheel Drive"))
			return "2";
		if(driveSystem.equalsIgnoreCase("All Wheel Drive"))
			return "3";
		if(driveSystem.equalsIgnoreCase("No"))
			return "4";
		return "-1";
	}

	public static String decodeEnclosure(String enclosure) {
		if(enclosure.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(enclosure.equalsIgnoreCase("OROPS"))
			return "1";
		if(enclosure.equalsIgnoreCase("EROPS"))
			return "2";
		if(enclosure.equalsIgnoreCase("EROPS AC"))
			return "3";
		if(enclosure.equalsIgnoreCase("NO ROPS"))
			return "4";
		return "-1";
	}
	
	public static String decodeForks(String forks) {
		if(forks.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(forks.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodePadType(String padType) {
		if(padType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(padType.equalsIgnoreCase("Street"))
			return "1";
		if(padType.equalsIgnoreCase("Grouser"))
			return "2";
		if(padType.equalsIgnoreCase("Reversible"))
			return "3";
		return "-1";
	}

	public static String decodeRideControl(String rideControl) {
		if(rideControl.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(rideControl.equalsIgnoreCase("Yes"))
			return "1";
		if(rideControl.equalsIgnoreCase("No"))
			return "2";
		return "-1";
	}

	public static String decodeStick(String stick) {
		if(stick.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(stick.equalsIgnoreCase("Standard"))
			return "1";
		if(stick.equalsIgnoreCase("Extended"))
			return "2";
		return "-1";
	}

	public static String decodeTransmission(String transmission) {
		if(transmission.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(transmission.equalsIgnoreCase("Standard"))
			return "1";
		if(transmission.equalsIgnoreCase("Autoshift"))
			return "2";
		if(transmission.equalsIgnoreCase("Hydrostatic"))
			return "3";
		if(transmission.equalsIgnoreCase("Powershift"))
			return "4";
		if(transmission.equalsIgnoreCase("Powershuttle"))
			return "5";
		if(transmission.equalsIgnoreCase("Direct Drive"))
			return "6";
		return "-1";
	}

	public static String decodeTurbocharger(String turbocharger) {
		if(turbocharger.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(turbocharger.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodePushBlock(String pushblock) {
		if(pushblock.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(pushblock.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodeBladeExtension(String bladeextension) {
		if(bladeextension.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(bladeextension.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}


	public static String decodeBladeType(String bladeType) {
		if(bladeType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(bladeType.equalsIgnoreCase("Straight"))
			return "1";
		if(bladeType.equalsIgnoreCase("U"))
			return "2";
		if(bladeType.equalsIgnoreCase("Semi U"))
			return "3";
		if(bladeType.equalsIgnoreCase("PAT"))
			return "4";
		if(bladeType.equalsIgnoreCase("VPAT"))
			return "5";
		if(bladeType.equalsIgnoreCase("Angle"))
			return "6";
		if(bladeType.equalsIgnoreCase("Landfill"))
			return "7";
		if(bladeType.equalsIgnoreCase("Coal"))
			return "8";
		if(bladeType.equalsIgnoreCase("No"))
			return "9";

		return "-1";
	}

	public static String decodeTravelControls(String travelColntrols) {
		if(travelColntrols.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(travelColntrols.equalsIgnoreCase("Pedal"))
			return "1";
		if(travelColntrols.equalsIgnoreCase("Lever"))
			return "2";
		if(travelColntrols.equalsIgnoreCase("1 Speed"))
			return "3";
		if(travelColntrols.equalsIgnoreCase("2 Pedal"))
			return "4";
		if(travelColntrols.equalsIgnoreCase("Finger Tip"))
			return "5";
		if(travelColntrols.equalsIgnoreCase("Differential Steer"))
			return "6";
		return "-1";
	}

	public static String decodeEnclosureType(String enclosureType) {
		if(enclosureType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(enclosureType.equalsIgnoreCase("High Profile"))
			return "1";
		if(enclosureType.equalsIgnoreCase("Low Profile"))
			return "2";
		return "-1";
	}

	public static String decodeEngineHorsepower(String engineHorsepower) {
		if(engineHorsepower.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(engineHorsepower.equalsIgnoreCase("No"))
			return "1";
		if(engineHorsepower.equalsIgnoreCase("Variable"))
			return "2";
		return "-1";
	}

	public static String decodeHydraulisc(String hydraulics) {
		if(hydraulics.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(hydraulics.equalsIgnoreCase("Standard"))
			return "1";
		if(hydraulics.equalsIgnoreCase("Base + 1 Function"))
			return "2";
		if(hydraulics.equalsIgnoreCase("Auxiliary"))
			return "3";
		if(hydraulics.equalsIgnoreCase("2 Valve"))
			return "4";
		if(hydraulics.equalsIgnoreCase("3 Valve"))
			return "5";
		if(hydraulics.equalsIgnoreCase("4 Valve"))
			return "6";
		if(hydraulics.equalsIgnoreCase("Base + 2 Function"))
			return "7";
		if(hydraulics.equalsIgnoreCase("Base + 3 Function"))
			return "8";
		if(hydraulics.equalsIgnoreCase("Base + 4 Function"))
			return "9";
		if(hydraulics.equalsIgnoreCase("Base + 5 Function"))
			return "10";
		if(hydraulics.equalsIgnoreCase("Base + 6 Function"))
			return "11";
		return "-1";
	}

	public static String decodeHydraulicsFlow(String hydraulicsFlow) {
		if(hydraulicsFlow.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(hydraulicsFlow.equalsIgnoreCase("Standard"))
			return "1";
		if(hydraulicsFlow.equalsIgnoreCase("High Flow"))
			return "2";
		return "-1";
	}

	public static String decodeCoupler(String coupler) {
		if(coupler.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(coupler.equalsIgnoreCase("Manual"))
			return "1";
		if(coupler.equalsIgnoreCase("Hydraulic"))
			return "2";
		return "-1";
	}

	public static String decodeCouplerSystem(String couplerSystem) {
		if(couplerSystem.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(couplerSystem.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodeGrouserTracks(String grouserTracks) {
		if(grouserTracks.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(grouserTracks.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodeGrouserType(String grouserType) {
		if(grouserType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(grouserType.equalsIgnoreCase("Single"))
			return "2";
		if(grouserType.equalsIgnoreCase("Double"))
			return "2";
		if(grouserType.equalsIgnoreCase("Triple"))
			return "3";
		return "-1";
	}

	public static String decodeDifferentialType(String differentialType) {
		if(differentialType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(differentialType.equalsIgnoreCase("Standard"))
			return "1";
		if(differentialType.equalsIgnoreCase("Limited Slip"))
			return "2";
		if(differentialType.equalsIgnoreCase("Locking"))
			return "3";
		if(differentialType.equalsIgnoreCase("No Spin"))
			return "4";
		return "-1";
	}

	public static String decodeRipper(String ripper) {
		if(ripper.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(ripper.equalsIgnoreCase("Single Shank"))
			return "1";
		if(ripper.equalsIgnoreCase("Multi Shank"))
			return "2";
		if(ripper.equalsIgnoreCase("Yes"))
			return "3";
		return "-1";
	}

	public static String decodeScarifier(String scarifier) {
		if(scarifier.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(scarifier.equalsIgnoreCase("Yes"))
			return "1";
		return "-1";
	}

	public static String decodeTipControl(String tipControl) {
		if(tipControl.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(tipControl.equalsIgnoreCase("Sideshift & Tip"))
			return "1";
		if(tipControl.equalsIgnoreCase("Tip"))
			return "2";
		return "-1";
	}

	public static String decodeTrackType(String trackType) {
		if(trackType.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(trackType.equalsIgnoreCase("Rubber"))
			return "1";
		if(trackType.equalsIgnoreCase("Steel"))
			return "2";
		return "-1";
	}

	public static String decodeThum(String thumb) {
		if(thumb.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(thumb.equalsIgnoreCase("Hydraulic"))
			return "1";
		if(thumb.equalsIgnoreCase("Manual"))
			return "2";
		return "-1";
	}

	public static String decodePatternChanger(String patternChanger) {
		if(patternChanger.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(patternChanger.equalsIgnoreCase("Yes"))
			return "1";
		if(patternChanger.equalsIgnoreCase("No"))
			return "2";
		return "-1";
	}

	public static String decodeSteeringControl(String steeringControl) {
		if(steeringControl.equalsIgnoreCase("None or Unspecified"))
			return "0";
		if(steeringControl.equalsIgnoreCase("Conventional"))
			return "1";
		if(steeringControl.equalsIgnoreCase("Four Wheel Standard"))
			return "2";
		if(steeringControl.equalsIgnoreCase("No"))
			return "3";
		if(steeringControl.equalsIgnoreCase("Wheel"))
			return "4";
		if(steeringControl.equalsIgnoreCase("Command Control"))
			return "5";
		return "-1";
	}

	private static Entities replaceString(Entities entity, String orig, String repl) {
		for(int i = 0; i < entity.values.size(); i++) {
			entity.values.set(i, entity.values.get(i).trim());
			if(entity.values.get(i).equalsIgnoreCase(orig)) {
				entity.values.set(i, repl);
			}
		}
		if(!entity.domain.contains(repl) && repl.length() > 0) {
			entity.domain.add(repl);
		}
		entity.domain.remove(orig);
		entity.domain.remove(" " + orig);
		return entity;
	}

	public static Entities replaceMissingValues(Entities entity){
		if (entity.name.equalsIgnoreCase("Drive_System")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeDriveSystem(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeDriveSystem(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Enclosure")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			entity = replaceString(entity, "EROPS w AC", "EROPS AC");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeEnclosure(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeEnclosure(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Forks")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeForks(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeForks(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Pad_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodePadType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodePadType(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Stick")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeStick(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeStick(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Ride_Control")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeRideControl(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeRideControl(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Transmission")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeTransmission(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeTransmission(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Turbocharged")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeTurbocharger(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeTurbocharger(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Blade_Extension")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeBladeExtension(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeBladeExtension(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Hydraulics")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeHydraulisc(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeHydraulisc(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Pushblock")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodePushBlock(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodePushBlock(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Ripper")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeRipper(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeRipper(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Scarifier")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeScarifier(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeScarifier(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Tip_Control")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeTipControl(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeTipControl(str));
			}
			entity.domain = domain;
		}else if (entity.name.equalsIgnoreCase("Enclosure_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeEnclosureType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeEnclosureType(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Engine_Horsepower")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeEngineHorsepower(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeEngineHorsepower(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Coupler")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeCoupler(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeCoupler(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Coupler_System")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeCouplerSystem(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeCouplerSystem(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Grouser_Tracks")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeGrouserTracks(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeGrouserTracks(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Hydraulics_Flow")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeHydraulicsFlow(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeHydraulicsFlow(str));
			}
			entity.domain = domain;
		}  else if (entity.name.equalsIgnoreCase("Track_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeTrackType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeTrackType(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Thumb")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeThum(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeThum(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Pattern_Changer")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodePatternChanger(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodePatternChanger(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Grouser_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeGrouserType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeGrouserType(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Blade_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeBladeType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeBladeType(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Travel_Controls")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeTravelControls(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeTravelControls(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Differential_Type")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeDifferentialType(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeDifferentialType(str));
			}
			entity.domain = domain;
		} else if (entity.name.equalsIgnoreCase("Steering_Controls")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeSteeringControl(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeSteeringControl(str));
			}
			entity.domain = domain;
		}
		return entity;
	}

	public static Entities replaceMissingValuesBL(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i,entity.values.get(i).trim());
				entity.values.set(i, decodeProductClassBL(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassBL(str));
			}
			entity.domain = domain;
		}
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductSize(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductSize(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}

	public static Entities replaceMissingValuesMG(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i,entity.values.get(i).trim());
				entity.values.set(i, decodeProductClassMG(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassMG(str));
			}
			entity.domain = domain;
		}
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductSize(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeProductSize(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}

	public static Entities replaceMissingValuesSSL(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			entity = replaceString(entity, "?", "Skid Steer Loader - Unidentified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductClassSSL(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassSSL(str));
			}
			entity.domain = domain;
		} 
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductSize(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeProductSize(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}

	public static Entities replaceMissingValuesTEX(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			entity = replaceString(entity, "?", "Track - Unidentified");
			entity = replaceString(entity, "Track - Unidentified (Compact Construction)", "Track - Unidentified");
			entity = replaceString(entity, "Track - 4.0 to 6.0 Metric Tons", "Track - 5.0 to 6.0 Metric Tons");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductClassTEX(entity.values.get(i).trim()));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassTEX(str));
			}
			entity.domain = domain;
		} 
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductSizeTEX(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeProductSizeTEX(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}

	public static Entities replaceMissingValuesTTT(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i,entity.values.get(i).trim());
				entity.values.set(i, decodeProductClassTTT(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassTTT(str));
			}
			entity.domain = domain;
		}
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i,entity.values.get(i).trim());
				entity.values.set(i, decodeProductSize(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				domain.add(decodeProductSize(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}

	public static Entities replaceMissingValuesWL(Entities entity) {
		if (entity.name.equalsIgnoreCase("fiProductClassDesc")) {
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i,entity.values.get(i).trim());
				entity.values.set(i, decodeProductClassWL(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductClassWL(str));
			}
			entity.domain = domain;
		}
		entity = replaceMissingValues(entity);
		if (entity.name.equalsIgnoreCase("ProductSize")) {
			entity = replaceString(entity, "?", "None or Unspecified");
			for(int i = 0; i < entity.values.size(); i++) {
				entity.values.set(i, decodeProductSize(entity.values.get(i)));
			}
			Set<String> domain = new TreeSet<String>();
			for(String str : entity.domain) {
				str = str.trim();
				domain.add(decodeProductSize(str));
			}
			entity.domain = domain;
		} 
		return entity;
	}
}
