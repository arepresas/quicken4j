/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Transactions.java
 * Copyright (C) 2016 FracPete
 */

package com.github.fracpete.quicken4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Container for transactions.
 *
 * @author FracPete (fracpete at gmail dot com)
 * @version $Revision$
 */
public class Transactions
  extends ArrayList<Transaction> {

  /**
   *
   */
  private static final long serialVersionUID = 7861635223791823156L;

  /** the type of transactions. */
  protected String m_Type;

  /**
   * Initializes the transactions.
   *
   * @param type	the type of the transactions
   */
  public Transactions(String type) {
    super();
    m_Type = type;
  }

  /**
   * Returns the type of the transactions.
   *
   * @return		the type
   */
  public String getType() {
    return m_Type;
  }

  /**
   * Returns the codes from all transactions.
   *
   * @return		the codes
   */
  public Set<String> getCodes() {
    Set<String>		result;

    result = new HashSet<>();
    for (final Transaction t: this) {
      result.addAll(t.keys());
    }

    return result;
  }
}
