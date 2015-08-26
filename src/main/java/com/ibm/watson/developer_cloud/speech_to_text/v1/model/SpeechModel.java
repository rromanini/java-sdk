/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.watson.developer_cloud.speech_to_text.v1.model;

import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * The Class SpeechModel.
 */
public class SpeechModel {

	/** The Constant ES_BROADBAND16K. */
	public static final SpeechModel ES_BROADBAND16K = new SpeechModel("es-ES_BroadbandModel");

	/** The name. */
	private String name;
	
	/** The rate. */
	private int rate;
	
	/** The sessions. */
	private String sessions;

	/**
	 * Instantiates a new speech model.
	 * 
	 * @param name
	 *            the name
	 */
	public SpeechModel(String name) {
		super();
		this.name = name;
	}

	/**
	 * Gets the rate.
	 * 
	 * @return The rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * Sets the rate.
	 * 
	 * @param rate
	 *            The rate
	 */
	public void setRate(final int rate) {
		this.rate = rate;
	}

	/**
	 * With rate.
	 * 
	 * @param rate
	 *            the rate
	 * @return the model
	 */
	public SpeechModel withRate(final int rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * With sessions.
	 * 
	 * @param sessions
	 *            the sessions
	 * @return the model
	 */
	public SpeechModel withSessions(final String sessions) {
		this.sessions = sessions;
		return this;
	}

	/**
	 * Gets the name.
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * With name.
	 * 
	 * @param name
	 *            the name
	 * @return the model
	 */
	public SpeechModel withName(final String name) {
		this.name = name;
		return this;
	}

	/**
	 * Gets the sessions.
	 * 
	 * @return the sessions
	 */
	public String getSessions() {
		return sessions;
	}

	/**
	 * Sets the sessions.
	 * 
	 * @param sessions
	 *            the new sessions
	 */
	public void setSessions(final String sessions) {
		this.sessions = sessions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SpeechModel that = (SpeechModel) o;

		if (rate != that.rate) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		return !(sessions != null ? !sessions.equals(that.sessions) : that.sessions != null);

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + rate;
		result = 31 * result + (sessions != null ? sessions.hashCode() : 0);
		return result;
	}

	/*
             * (non-Javadoc)
             *
             * @see java.lang.Object#toString()
             */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ GsonSingleton.getGson().toJson(this);
	}

}