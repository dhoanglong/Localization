/**
 * Copyright (c) 2017, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.appium.device;

/**
 * @author wasiq.bhamla
 * @since Jan 26, 2018 10:02:12 PM
 */
public enum WaitStrategy {
	/**
	 * Wait until element is enabled.
	 */
	ENABLED,
	/**
	 * Wait until element is present.
	 */
	PRESENT,
	/**
	 * Wait until element is displayed.
	 */
	VISIBLE
}