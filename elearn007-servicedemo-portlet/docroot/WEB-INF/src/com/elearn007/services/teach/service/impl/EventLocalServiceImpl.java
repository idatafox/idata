/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.elearn007.services.teach.service.impl;

import com.elearn007.services.teach.service.base.EventLocalServiceBaseImpl;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import com.elearn007.services.teach.model.Event;
import com.elearn007.services.teach.service.EventLocalServiceUtil;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.elearn007.services.teach.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author jakelee
 * @see com.elearn007.services.teach.service.base.EventLocalServiceBaseImpl
 * @see com.elearn007.services.teach.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.elearn007.services.teach.service.EventLocalServiceUtil} to access the event local service.
	 * 
	 *
	 */
	
	public Event addEvent(
	        long userId, long groupId, String name, String description,
	        int month, int day, int year, int hour, int minute, long locationId,
	        ServiceContext serviceContext)
	    throws PortalException, SystemException {
		
		 User user = userPersistence.findByPrimaryKey(userId);

		    Date now = new Date();

		    long eventId = counterLocalService.increment(Event.class.getName());

		    Event event = eventPersistence.create(eventId);

		    event.setName(name);
		    event.setDesciption(description);

		    Calendar dateCal = CalendarFactoryUtil.getCalendar(
		        user.getTimeZone());
		    dateCal.set(year, month, day, hour, minute);
		    Date date = dateCal.getTime();
		    event.setDate(date);

		    event.setLocationId(locationId);

		    event.setGroupId(groupId);
		    event.setCompanyId(user.getCompanyId());
		    event.setUserId(user.getUserId());
		    event.setCreateDate(serviceContext.getCreateDate(now));
		    event.setModifiedDate(serviceContext.getModifiedDate(now));

		    super.addEvent(event);

		    // Resources
		    
		    resourceLocalService.addResources(
		            event.getCompanyId(), event.getGroupId(), event.getUserId(),
		            Event.class.getName(), event.getEventId(), false,
		            true, true);

		        return event;
	}
	
	
	
	public Event deleteEvent(Event event) throws SystemException {

	    return eventPersistence.remove(event);
	}
	
	
	public Event getEvent(long eventId)
		    throws SystemException, PortalException {

		    return eventPersistence.findByPrimaryKey(eventId);
		}

		public List<Event> getEventsByGroupId(long groupId) throws SystemException {

		    return eventPersistence.findByGroupId(groupId);
		}
	
	
	public List<Event> getEventsByGroupId(long groupId, int start, int end)
		    throws SystemException {

		    return eventPersistence.findByGroupId(groupId, start, end);
		}

		public int getEventsCountByGroupId(long groupId) throws SystemException {

		    return eventPersistence.countByGroupId(groupId);
		}
	
	public Event updateEvent(
	        long userId, long eventId, String name, String description,
	        int month, int day, int year, int hour, int minute,
	        long locationId, ServiceContext serviceContext)
	    throws PortalException, SystemException {

	    User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    Event event = EventLocalServiceUtil.fetchEvent(eventId);

	    event.setModifiedDate(serviceContext.getModifiedDate(now));
	    event.setName(name);
	    event.setDesciption(description);

	    Calendar dateCal = CalendarFactoryUtil.getCalendar(
	        user.getTimeZone());
	    dateCal.set(year, month, day, hour, minute);
	    Date date = dateCal.getTime();
	    event.setDate(date);

	    event.setLocationId(locationId);

	    super.updateEvent(event);

	    return event;
	}
	
	
	
	
}