/*
 * This program is the client app for Team Unununium's VR Robot Explorer found at <https://github.com/team-unununium>
 * Copyright (C) 2020 Team Unununium
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/> .
 */

package io.github.unununium.util;

/** The file containing all the constants of the app (even enums). **/
public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String SERVER_PREFIX = "Server: ";
    public static final String MODE_PREFIX = "Mode: ";
    public static final String CAMERA_NIGHT_MODE_PREFIX = "Camera night mode: ";
    public static final String EXTERNAL_CONTROLLER_PREFIX = "External controller: ";
    public static final String PHONE_MODE_PREFIX = "Phone controls: ";
    public static final String X_PREFIX = "X: ";
    public static final String Y_PREFIX = "Y: ";
    public static final String Z_PREFIX = "Z: ";
    public static final String CO_PREFIX = "CO: ";
    public static final String CH4_PREFIX = "CH₄: ";
    public static final String H2_PREFIX = "H₂: ";
    public static final String LPG_PREFIX = "LPG: ";

    public static final String DISTANCE_SUFFIX = " mm";
    public static final String HUMIDITY_SUFFIX = " %";
    public static final String TEMP_SUFFIX = " °C";
    public static final String WARNING_SUFFIX = " ⚠";
}
