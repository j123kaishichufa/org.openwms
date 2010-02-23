/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.common.service;

import org.openwms.common.domain.Location;
import org.openwms.common.domain.LocationPK;
import org.openwms.common.domain.TransportUnit;
import org.openwms.common.domain.TransportUnitType;
import org.openwms.common.domain.values.Barcode;

/**
 * A TransportService.
 * <p>
 * Extends the {@link EntityService} interface about some useful methods
 * regarding the general handling with {@link TransportUnit}s.
 * </p>
 * 
 * @author <a href="mailto:openwms@googlemail.com">Heiko Scherrer</a>
 * @version $Revision: 877 $
 * @since 0.1
 * @see EntityService
 */
public interface TransportUnitService extends EntityService<TransportUnit> {

    /**
     * Create a new {@link TransportUnit} with the type
     * {@link TransportUnitType} placed on an initial <tt>Location</tt>. The new
     * {@link TransportUnit} has the given {@link Barcode} as identifier.
     * 
     * @param barcode
     *            - {@link Barcode} of the new {@link TransportUnit}
     * @param transportUnitType
     *            - The type of the new {@link TransportUnit}
     * @param actualLocation
     *            - The {@link Location} where the {@link TransportUnit} is
     *            placed on
     * @return - The updated {@link TransportUnit} instance
     */
    TransportUnit createTransportUnit(Barcode barcode, TransportUnitType transportUnitType, LocationPK actualLocation);

    /**
     * Move a {@link TransportUnit} identified by its {@link Barcode} to the
     * given target <tt>Location</tt> identified by the {@link LocationPK}.
     * 
     * @param barcode
     *            - {@link Barcode} of the {@link TransportUnit} to move
     * @param targetLocationPK
     *            - Unique identifier of the target <tt>Location</tt>
     */
    void moveTransportUnit(Barcode barcode, LocationPK targetLocationPK);

}