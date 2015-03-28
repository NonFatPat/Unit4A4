public class person{
		public String name;
		public int weight;
		public int heightft;
		public int heightin;
		
		public person(String nameArgs, int weightArgs, int heightftArgs, int heightinArgs){
			name = nameArgs;
			weight=weightArgs;
			heightft= heightftArgs;
			heightin=heightinArgs;
		}
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name 
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the weight
		 */
		public int getWeight() {
			return weight;                       
		}
		/**
		 * @param weight the weight to set
		 */
		public void setWeight(int weight) {
			this.weight = weight;
		}
		/**
		 * @return the heightft
		 */
		public int getHeightft() {
			return heightft;
		}
		/**
		 * @param heightft the heightft to set
		 */
		public void setHeightft(int heightft) {
			this.heightft = heightft;
		}
		/**
		 * @return the heightin
		 */
		public int getHeightin() {
			return heightin;
		}
		/**
		 * @param heightin the heightin to set
		 */
		public void setHeightin(int heightin) {
			this.heightin = heightin;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "person [name=" + name + ", weight=" + weight
					+ ", height="+heightft+"ft" + heightin +"in"+ "]";
		}
		
	}