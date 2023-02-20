<template>
  <div>
    <el-menu
        style="width: 200px; min-height: 100vh"
        default-active="2"
        class="el-menu-vertical-demo">
      <!--        @open="handleOpen"-->
      <!--        @close="handleClose"-->
      <!--        >-->
      <el-sub-menu index="1">
                <template #title>
                  <el-icon>
                    <location/>
                  </el-icon>
                  <span>选项1</span>
                </template>
        <el-menu-item index="1-1">item one</el-menu-item>
        <el-menu-item index="1-2">item two</el-menu-item>
      </el-sub-menu>

      <el-menu-item index="2">
        <el-icon>
          <icon-menu/>
        </el-icon>
        <span>Navigator Two</span>
      </el-menu-item>
      <el-menu-item index="3" disabled>
        <el-icon>
          <document/>
        </el-icon>
        <span>Navigator Three</span>
      </el-menu-item>
      <el-menu-item index="4">
        <el-icon>
          <setting/>
        </el-icon>
        <span>Navigator Four</span>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: "Aside.vue"
}
</script>

<style scoped>

</style>